# ☕ Java Learning Journey

Welcome to my Java learning repository! This project tracks my progress as I learn core Java concepts, solve coding problems, and build programs.

The repository is structured chronologically by topic, making it easy to review concept code and practice problems.

---

## 📂 Repository Index & Tracker

| # | Topic | 📚 Concepts / Lectures | ✍️ Practice / Assignments | Status |
|---|-------|------------------------|---------------------------| :---: |
| 01 | **Java Basics** | [JavaBasics.java](file:///c:/Users/91910/Desktop/Java/01-Java-Basics/Lectures/JavaBasics.java) | [Patterns2.java](file:///c:/Users/91910/Desktop/Java/01-Java-Basics/Practice/Patterns2.java) | 🟢 Completed |
| 02 | **Arrays** | [ArrayCC.java](file:///c:/Users/91910/Desktop/Java/02-Arrays/Lectures/ArrayCC.java) | [ArrayCC2.java](file:///c:/Users/91910/Desktop/Java/02-Arrays/Practice/ArrayCC2.java) | 🟢 Completed |
| 03 | **Basic Sorting** | [BasicSorting.java](file:///c:/Users/91910/Desktop/Java/03-Basic-Sorting/Lectures/BasicSorting.java) | *None yet* | 🟢 Completed |
| 04 | **Matrices (2D Arrays)** | [Matrices.java](file:///c:/Users/91910/Desktop/Java/04-Matrices/Lectures/Matrices.java) | *None yet* | 🟢 Completed |
| 05 | **Strings** | [Strings.java](file:///c:/Users/91910/Desktop/Java/05-Strings/Lectures/Strings.java) | *None yet* | 🟢 Completed |
| 06 | **Bit Manipulation** | [BitManipulation.java](file:///c:/Users/91910/Desktop/Java/06-Bit-Manipulation/Lectures/BitManipulation.java) | *None yet* | 🟢 Completed |
| 07 | **Object Oriented Programming (OOP)** | [OOPS.java](file:///c:/Users/91910/Desktop/Java/07-OOPS/Lectures/OOPS.java) | [OoopsPractice.java](file:///c:/Users/91910/Desktop/Java/07-OOPS/Practice/OoopsPractice.java) | 🟢 Completed |
| 08 | **Recursion** | [Recursion.java](file:///c:/Users/91910/Desktop/Java/08-Recursion/Lectures/Recursion.java) | [RecursionPractice.java](file:///c:/Users/91910/Desktop/Java/08-Recursion/Practice/RecursionPractice.java) | 🟢 Completed |
| 09 | **Divide & Conquer** | [DivideConquer.java](file:///c:/Users/91910/Desktop/Java/09-Divide-Conquer/Lectures/DivideConquer.java) | *None yet* | 🟢 Completed |
| 10 | **Backtracking** | [BackTracking.java](file:///c:/Users/91910/Desktop/Java/10-Backtracking/Lectures/BackTracking.java) | *None yet* | 🟡 In Progress |
| 11 | **Miscellaneous** | [Revision.java](file:///c:/Users/91910/Desktop/Java/Miscellaneous/Revision.java) | [Practice.java](file:///c:/Users/91910/Desktop/Java/Miscellaneous/Practice.java), [Practice2.java](file:///c:/Users/91910/Desktop/Java/Miscellaneous/Practice2.java) | 🔄 Continuous |

---

## 📜 Rules for Repository Maintenance & Practice

> [!IMPORTANT]
> **Follow these simple rules every time you learn a new topic or solve practice questions to keep the workspace clean and ready for Git!**

### 1. File & Folder Organization
* **Chronological Order:** Always prefix new folders with a double-digit number (e.g., `11-Linked-Lists`, `12-Stacks-Queues`).
* **Sub-folder Rules:**
  * Put theory, notes, or lecture-follow-along code inside the `Lectures/` subfolder.
  * Put assignments, practice problems, or platform questions (e.g., LeetCode/GeeksforGeeks) inside the `Practice/` subfolder.

### 2. Git & Cleanliness Rules
* **Never commit `.class` files:** The `.gitignore` is set up to ignore them. Keep your repository clean by only tracking source `.java` files.
* **Update the Index:** Whenever you add a new topic or complete files, update the **Repository Index & Tracker** table above. It acts as your study dashboard!

### 3. Practice Workflow
* If you are revising or practicing mixed topics (not specific to a single chapter), place the files inside the `Miscellaneous/` folder to avoid cluttering the main directory.


---

## 🚀 How to Create a New Topic Automatically

I have created an automation script called [create-topic.ps1](file:///c:/Users/91910/Desktop/Java/create-topic.ps1) in the root directory. This script automatically detects the next chronological number and creates the standard folders.

### How to use it:
1. Open your terminal in the root directory.
2. Run the script:
   ```powershell
   .\create-topic.ps1
   ```
3. Type the name of your new topic when prompted (e.g. `Linked Lists`) and hit **Enter**.
4. The script will automatically create `11-Linked-Lists/` with `Lectures/` and `Practice/` sub-folders inside!

---

## ⚙️ Project Setup

- **IDE:** Antigravity IDE / VS Code
- **Git Config:** Compiled `.class` files and IDE settings files are ignored via `.gitignore` to keep the repository clean.

