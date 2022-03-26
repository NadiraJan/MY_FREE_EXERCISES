package arrayExercises;

public class LesArrayAccount {
    public static final class Account {
        private float money;
        private String name;

        public float getMoney() {
            return money;
        }

        public void setMoney(float money) {
            this.money = money;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public static void main(String[] args) {
            Account[] accounts = new Account[5];
            accounts[0] = new Account();
            accounts[0].setName("Ivan petriv");
            accounts[0].setMoney(100f);

            accounts[0] = new Account();
            accounts[0].setName("Ivan petriv");
            accounts[0].setMoney(100f);

            accounts[1] = new Account();
            accounts[1].setName("Vlad Soe");
            accounts[1].setMoney(200f);

            accounts[2] = new Account();
            accounts[2].setName("John Eled");
            accounts[2].setMoney(250f);

            accounts[3] = new Account();
            accounts[3].setName("Oleg Zerr");
            accounts[3].setMoney(400f);

            accounts[4] = new Account();
            accounts[4].setName("Mike Flee");
            accounts[4].setMoney(500f);

            for (int i = 0; i < accounts.length; i++) {
                float currentMoney = accounts[i].getMoney();
                currentMoney = currentMoney + currentMoney * 0.1f;
                accounts[i].setMoney(currentMoney);

            }
            for (int i = 0; i < accounts.length; i++) {
                System.out.println("Name:" + accounts[i].getName() + "money" + accounts[i].getMoney());
            }
        }
    }
}
