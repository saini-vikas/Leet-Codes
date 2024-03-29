public class CoinChange {
        public int coinChange(int[] coins, int amount) {
            if (amount < 1){
                return 0;
            }
            int[] temp = new int[amount+1];
            for (int i=1; i<=amount; i++){
                temp[i] = Integer.MAX_VALUE;
                for (int coin: coins){
                    if(coin <= i && temp[i - coin] != Integer.MAX_VALUE){
                        temp[i] = Math.min(temp[i], 1 + temp[i - coin]);
                    }
                }
                System.out.println(temp[i]);
            }

            if (temp[amount] == Integer.MAX_VALUE){
                return -1;
            }

            return temp[amount];
        }

}
