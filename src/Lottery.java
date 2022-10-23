public class Lottery {
    /* instance variables */
    private int lotteryNumber;
    private String strLotNum;
    private String strUserNum;

    /* constructor */
    public Lottery() {
        lotteryNumber = (int) (Math.random() * 100);
        strLotNum = numForm(lotteryNumber);
    }

    // methods
    public int determineWinnings(int userNumber) {
        strUserNum = numForm(userNumber);

        if (lotteryNumber == userNumber) {
            return 100;
        } else if (firstDigit(strLotNum).equals(secondDigit(strUserNum)) && secondDigit(strLotNum).equals(firstDigit(strUserNum))) {
            return 10;
        } else if (firstDigit(strLotNum).equals(firstDigit(strUserNum)) || firstDigit(strLotNum).equals(secondDigit(strUserNum))) {
            return 3;
        } else if (secondDigit(strLotNum).equals(firstDigit(strUserNum)) || secondDigit(strLotNum).equals(secondDigit(strUserNum))) {
            return 3;
        } else {
            return 0;
        }
    }

    public String firstDigit(String number) {
        return number.substring(0,1);
    }

    public String secondDigit(String number) {
        return number.substring(1);
    }

    public String numForm(int number) {
        String strNum;
        if (number < 10) {
            strNum = "0" + number;
        } else {
            strNum = number + "";
        }
        return strNum;
    }

    public String getLotNum() {
        return strLotNum;
    }
}
