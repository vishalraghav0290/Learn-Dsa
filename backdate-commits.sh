#!/bin/bash

# Array of commit dates from your history
declare -a dates=(
"2024-12-30" "2024-12-30" "2024-12-30" "2024-12-30" 
"2024-12-29" "2024-12-29" "2024-12-29" "2024-12-29" 
"2024-12-28" "2024-12-28" "2024-12-28" "2024-12-27" 
"2024-12-25" "2024-12-24" "2024-12-23" "2024-12-22" 
"2024-12-21" "2024-12-20" "2024-12-20" "2024-12-20" 
"2024-12-19" "2024-12-19" "2024-12-19" "2024-12-13" 
"2024-12-12" "2024-12-12" "2024-12-12" "2024-12-11" 
"2024-12-11" "2024-12-11" "2024-12-10" "2024-12-09" 
"2024-12-08" "2024-12-01" "2024-11-30" "2024-11-22" 
"2024-11-21" "2024-11-20" "2024-11-19" "2024-11-18" 
"2024-11-18" "2024-11-17" "2024-11-16" "2024-11-11" 
"2024-11-11" "2024-11-11" "2024-11-10" "2024-11-03" 
"2024-11-02" "2024-11-01" "2024-10-30" "2024-10-30" 
"2024-10-30" "2024-10-27" "2024-10-26" "2024-10-25" 
"2024-10-25" "2024-10-25" "2024-10-25" "2024-10-23" 
"2024-10-23" "2024-10-21" "2024-10-20" "2024-10-18" 
"2024-10-18"
)

# Directory where your DSA solutions and projects are stored
FILES_DIR="/Users/vishalraghav/Documents/Ceo/yag/Learning-DSA"

# Make sure the repo is clean
git checkout main
# Counter to track which date we're on
date_index=0

# Get all files you want to commit
# Change this to match your file pattern (*.py, *.java, etc.)
files=$(find "$FILES_DIR" -type f -name "*.py" -o -name "*.java" -o -name "*.cpp" | sort)

for file in $files; do
    if [ $date_index -ge ${#dates[@]} ]; then
        echo "Warning: More files than dates available. Some files won't be committed."
        break
    fi
    
    # Get the current date from our array
    commit_date="${dates[$date_index]}"
    
    # Add a random time to make it look more natural
    hour=$((RANDOM % 12 + 9))  # Between 9 AM and 9 PM
    minute=$((RANDOM % 60))
    second=$((RANDOM % 60))
    
    formatted_date="${commit_date}T${hour}:${minute}:${second}+05:30"
    
    # Copy the file to the git repository
    filename=$(basename "$file")
    target_path="$filename"  # Adjust this to organize into subdirectories if needed
    
    # If file exists in destination, create a unique name to avoid conflicts
    if [ -f "$target_path" ]; then
        random_suffix=$((RANDOM % 1000))
        extension="${filename##*.}"
        name="${filename%.*}"
        target_path="${name}_${random_suffix}.${extension}"
    fi
    
    cp "$file" "$target_path"
    
    # Add and commit with the specific date
    git add "$target_path"
    GIT_COMMITTER_DATE="$formatted_date" git commit --date="$formatted_date" -m "Add solution for problem $(basename "$file" | sed 's/\.[^.]*$//')"
    
    echo "Committed $file with date $formatted_date"
    
    # Increment date index
    date_index=$((date_index + 1))
done

echo "All files committed. Ready to push."
echo "To push these commits to GitHub, run: git push origin main"
