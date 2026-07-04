# Get the next number prefix by scanning existing folders (e.g., 01-..., 02-...)
$existingFolders = Get-ChildItem -Directory | Where-Object { $_.Name -match '^\d{2}-' }
$nextNum = 1
if ($existingFolders) {
    $numbers = $existingFolders | ForEach-Object {
        if ($_.Name -match '^(\d{2})-') { [int]$Matches[1] }
    }
    $nextNum = ($numbers | Measure-Object -Maximum).Maximum + 1
}
$prefix = "{0:d2}" -f $nextNum

# Check if name was passed as argument, otherwise prompt the user
$topicName = $args[0]
if (-not $topicName) {
    $topicName = Read-Host "Enter the name of the new topic (e.g. Linked Lists)"
}

if (-not $topicName) {
    Write-Host "Error: No topic name provided." -ForegroundColor Red
    exit
}

# Format the folder name: replace spaces with hyphens
$slugName = $topicName -replace '\s+', '-'
$fullFolderName = "${prefix}-${slugName}"

# Create the folder structure
$lecturesPath = Join-Path $fullFolderName "Lectures"
$practicePath = Join-Path $fullFolderName "Practice"

New-Item -ItemType Directory -Path $lecturesPath -Force | Out-Null
New-Item -ItemType Directory -Path $practicePath -Force | Out-Null

Write-Host "`nSuccessfully created new topic folder structure:" -ForegroundColor Green
Write-Host "  $fullFolderName/" -ForegroundColor Cyan
Write-Host "  ├── Lectures/" -ForegroundColor Cyan
Write-Host "  └── Practice/" -ForegroundColor Cyan
