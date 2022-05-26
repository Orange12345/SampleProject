# SampleProject
or create a new repository on the command line
echo "# SampleProject" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/Orange12345/SampleProject.git
git push -u origin main
or push an existing repository from the command line
git remote add origin https://github.com/Orange12345/SampleProject.git
git branch -M main
git push -u origin main

$ git fetch origin
# Fetches updates made to an online repository
$ git merge origin YOUR_BRANCH_NAME
# Merges updates made online with your local work
Or, you can simply use git pull to perform both commands at once:

$ git pull origin YOUR_BRANCH_NAME
# Grabs online updates and merges them with your local work
