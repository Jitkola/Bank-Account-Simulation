# Bank Account Simulation

## Overview
This Java program simulates basic **bank account operations** using **Object-Oriented Programming (OOP)** concepts.  
Users can **deposit money, withdraw money, check their balance, view transaction history, and exit**. The program also keeps a record of all transactions.

---

## Features
- Create a bank account with **account holder name** and **initial balance**.
- **Deposit money** into the account.
- **Withdraw money** from the account with balance checks.
- **Check current balance** at any time.
- **View transaction history**, showing all deposits and withdrawals in order.
- Menu-driven program with **user-friendly interface**.
- Handles invalid inputs, negative amounts, and insufficient balance.

---

## Technologies Used
- **Java** (OOP concepts: classes, objects, methods, encapsulation)
- **VS Code** as the IDE for writing and running the program
- **ArrayList** for storing transaction history
- **Scanner** for console input

---

## How to Run
1. Ensure **Java JDK** is installed on your system.
2. Save the program as `BankAccountSimulation.java`.
3. Open a terminal or command prompt.
4. Navigate to the folder containing the file.
5. Compile the program:
   ```bash
   javac BankAccountSimulation.java
   java BankAccountSimultaion

## Screenshots / Program Demonstration

### Screenshot 1
- **Description:** Entering account holder name and initial balance. Then performing **Choice 1 (Deposit Money)** and **Choice 3 (Check Balance)**.  
- **Shows:** Account creation, deposit of money, and updated balance.

### Screenshot 2
- **Description:** Performing **Choice 4 (View Transaction History)** followed by **Choice 2 (Withdraw Money)**.  
- **Shows:** Transaction history after deposit and withdrawal prompt.

### Screenshot 3
- **Description:** Performing **Choice 3 (Check Balance)** and **Choice 4 (View Transaction History)**.  
- **Shows:** Updated balance and complete transaction history.

### Screenshot 4
- **Description:** Performing **Choice 2 (Withdraw Money)** and **Choice 1 (Deposit Money)**.  
- **Shows:** Withdrawal and deposit operations and their effect on balance.

### Screenshot 5
- **Description:** Performing **Choice 2 (Withdraw Money)** followed by an **invalid choice 6**.  
- **Shows:** Handling of withdrawal and invalid menu input.

### Screenshot 6
- **Description:** Performing **Choice 3 (Check Balance)** and **Choice 4 (View Transaction History)**.  
- **Shows:** Current balance and updated transaction history after multiple operations.

### Screenshot 7
- **Description:** Performing **Choice 5 (Exit)**.  
- **Shows:** Exiting the program gracefully.

