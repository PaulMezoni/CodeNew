package Multithreading;

class Multithreading {
    public static void main(String[] args) {
        Account account1 = new Account(1, 100000);
        Account account2 = new Account(2, 100000);
        Account account3 = new Account(3, 100000);
        Account account4 = new Account(4, 100000);
        Account account5 = new Account(5, 100000);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println();

        transfer(account1, account2, 5000);
        transfer(account2, account1, 5000);

        System.out.println(account1);
        System.out.println(account2);
    }

    static void transfer(Account accountLeft, Account accountRight, float amount) {
        synchronized (accountRight) {
            synchronized (accountLeft) {
                accountLeft.withdraw(amount);
                accountRight.deposit(amount);
            }
        }
    }

    static class Account {
        @Override
        public String toString() {
            return "Account{" +
                    "id=" + id +
                    ", deposit=" + deposit +
                    '}';
        }

        private final int id;
        private int deposit;

        public Account(int id, int deposit) {
            this.id = id;
            this.deposit = deposit;
        }

        public void withdraw(float amount) {
            //...
            amount = (deposit - amount);
            deposit = (int) amount;
        }

        public void deposit(float amount) {
            //...
            amount = (deposit + amount);
            deposit = (int) amount;
        }
    }
}
