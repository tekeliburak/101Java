import java.util.Scanner;

public class MineSweeper {
    int colNumber;
    int rowNumber;

    MineSweeper(int colNumber, int rowNumber) {
        this.colNumber = colNumber;
        this.rowNumber = rowNumber;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        int rrow;
        int ccol;
        int mine;
        mine = (this.colNumber * this.rowNumber / 4);
        int[] mineArrayRow = new int[mine];
        int[] mineArrayCol = new int[mine];
        mineArrayRow = fillMinusOne(mineArrayRow);
        mineArrayCol = fillMinusOne(mineArrayCol);
        for (int i = 0; i < mine; i++) {

            if (i > 0) {
                int randomRow = (int) (Math.random() * (this.rowNumber));
                int randomCol = (int) (Math.random() * (this.colNumber));
                if (isInArray(randomRow, mineArrayRow) && isInArray(randomCol, mineArrayCol)) {
                    i = i - 1;
                } else {
                    mineArrayRow[i] = randomRow;
                    mineArrayCol[i] = randomCol;
                }

            } else {
                int randomRow = (int) (Math.random() * (this.rowNumber));
                mineArrayRow[i] = randomRow;
                int randomCol = (int) (Math.random() * (this.colNumber));
                mineArrayCol[i] = randomCol;
            }
        }


        String[][] game = new String[this.rowNumber][this.colNumber];
        for (int z = 0; z < mine; z++) {
            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    if (z == 0) {
                        if (i == mineArrayRow[z] && j == mineArrayCol[z]) {
                            game[i][j] = "*";
                        } else {
                            game[i][j] = "-";
                        }

                    } else {
                        if (i == mineArrayRow[z] && j == mineArrayCol[z]) {
                            game[i][j] = "*";
                        }
                    }
                }
            }

            }
        /*System.out.println("Mayınların Konumu");

            for (int i = 0; i < game.length; i++) {
                for (int j = 0; j < game[i].length; j++) {
                    if (j == game[i].length - 1) {
                        System.out.print(game[i][j]);
                    } else {
                        System.out.print(game[i][j] + " ");
                    }
                }
                System.out.println();
            }
        System.out.println("---------------------------------------");
        */System.out.println("Mayın tarlası oyununa hoş geldiniz.");
        System.out.println();
        String[][] fakeMap = new String[this.rowNumber][this.colNumber];
        fakeMap = firstMap(fakeMap);
        int control = (this.rowNumber*this.colNumber)-(mine);
        int count=0;


        while(count<control){
            System.out.print("Satırı Giriniz: ");
            rrow = input.nextInt();
            System.out.print("Sütunu Giriniz: ");
            ccol = input.nextInt();
            int rowborder = rrow-1;
            int colborder = ccol-1;
            int mineNumber =0;
            if (rrow<0||rrow>=this.rowNumber||ccol<0||ccol>=this.colNumber){
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
                count=count-1;

            }
            else if (game[rrow][ccol].equals("*")) {
                System.out.println("Game Over!!");
                break;

            }
            else if(rrow>=0&&rrow<this.rowNumber&&ccol>=0&&ccol<this.colNumber){
                for (int i = 0;i<3;i++){
                    if (rowborder>=0&&rowborder<this.rowNumber){
                        for (int j=0;j<3;j++){
                            if (rowborder==rrow&&colborder==ccol) {
                                colborder+=1;
                            } else if (colborder>=0&&colborder<this.colNumber){
                                if (game[rowborder][colborder].equals("*")){
                                    mineNumber+=1;
                                    colborder+=1;
                                }
                                else{
                                    colborder+=1;
                                }
                            }
                            else if (colborder<0){
                                colborder+=1;
                            } else if (colborder>=this.colNumber) {
                                if(j<2){
                                    colborder+=1;
                                }
                            }
                        }
                        rowborder+=1;
                        colborder = ccol-1;
                    } else if (rowborder<0) {
                        rowborder+=1;
                    }
                    else{
                        if (i<2){
                            rowborder+=1;
                        }
                    }


                }
                String strr = String.valueOf(mineNumber);
                fakeMap[rrow][ccol]=strr;
                for (int i =0;i<this.rowNumber;i++){
                    for (int j =0;j<this.colNumber;j++){
                        if (j==this.colNumber-1){
                            System.out.print(fakeMap[i][j]);
                        }
                        else{
                            System.out.print(fakeMap[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

            }
            count+=1;
            if (count==control){
                System.out.println("Tebrikler oyunu tamamladınız.");
            }


        }





        }
        public int[] fillMinusOne ( int[] c){
            for (int i = 0; i < c.length; i++) {
                c[i] = -1;
            }
            return c;

        }
        public boolean isInArray ( int b, int[] k){
            boolean a = false;
            for (int i = 0; i < k.length; i++) {
                if (b == k[i]) {
                    a = true;
                    break;
                }
            }
            return a;
        }
        public String[][] firstMap(String[][] x){
        for (int i =0;i<this.rowNumber;i++){
            for (int j =0;j<this.colNumber;j++){
                x[i][j]="-";
            }
        }
        for (int i =0;i<this.rowNumber;i++){
            for (int j =0;j<this.colNumber;j++){
                if (j==this.colNumber-1){
                    System.out.print(x[i][j]);
                }
                else{
                    System.out.print(x[i][j] + " ");
                }
            }
            System.out.println();
        }
        return x;
        }

    }

