# DSA Problem Solving Rules

> Save this in your repo. Read it before every problem session.

---

## The 4-Step Loop (for every algorithm you learn)

| Step | What to do |
|------|-----------|
| **1. LEARN** | Watch/read the logic once — not the code, just the idea. Answer: What am I comparing? What action happens? When does it stop? Don't move on until you can answer all 3. |
| **2. SAY** | Close everything. Explain the algorithm in your own words out loud or on paper. Stuck mid-explanation? Go back to Step 1 for only that specific part. |
| **3. CODE** | Only now write the code. Set a 15-20 min timer. Stuck after real effort? Peek at one line only — not the full solution. |
| **4. REDO** | Next day, write it again from scratch. No notes. No references. This is what makes it stick. |

---

## The 5 Questions (ask yourself before every problem)

Before writing a single line of code, answer these on paper:

1. **What do I know about the input?** (sorted? positive only? any duplicates?)
2. **What does the output need to look like?**
3. **What is the simplest observation I can make?** (e.g. "largest elements are at the end")
4. **Can I solve a smaller/simpler version first?**
5. **Have I solved something similar before that I can reuse?**

> If you can't answer question 3, you're not ready to code yet. Keep thinking.

---

## Rules While Coding

- **Never copy a solution without attempting first.** Even a wrong attempt is better than nothing — it tells you exactly where your gap is.
- **Translate logic to code line by line.** Don't try to write the whole thing at once. One loop at a time, one condition at a time.
- **Stuck for 15 min?** Peek at one hint, not the full solution. Close it. Keep going yourself.
- **Wrong answer?** Don't look at the solution immediately. Dry run your code on paper first — trace it step by step with a small example.
- **Don't compare your code to the "official" solution until yours is complete.** Even if it looks different, it might be valid.

---

## Dry Run Rule

For every algorithm you write, dry run it manually on a small example (4-5 elements) before testing on a machine. Write out what each variable holds after each step.

This catches bugs faster than running the code and staring at wrong output.

---

## For Ascending vs Descending

Switching sort order = **flip one comparison operator only.**
- Ascending: `arr[j] > key`
- Descending: `arr[j] < key`

Nothing else changes structurally.

---

## For Interview Questions

When asked to explain your approach, always cover:
1. **Core idea** (one line — e.g. "majority element survives all cancellations")
2. **Time complexity**
3. **Space complexity**
4. **Edge cases** (negative numbers? empty array? no answer exists?)

---

## The Honest Rule

> "I understood the logic but can't write the code" means one thing: you skipped the SAY step. Go back and explain it out loud before touching the keyboard.

> "I can't think of where to start" means one thing: you haven't asked yourself the 5 questions yet. Answer them on paper first.

---

## Watch Out: Off-By-One Errors (your most common bug)

This trips you up every session. Before submitting any loop, ask yourself these 3 questions:

| Question | Example |
|----------|---------|
| Should this loop include the last element? | `i < arr.length` vs `i < arr.length-1` |
| Should this condition include 0? | `p2 >= 0` vs `p2 > 0` |
| Is `<` correct here or should it be `<=`? | `j < n-1-i` vs `j <= n-1-i` |

> Rule of thumb: when in doubt, trace the last iteration manually. Plug in the last valid index and check if your condition still lets it through.

---

## Reminder

You don't solve the whole problem at once. You answer one small question, then the next. That's it.