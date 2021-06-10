package com.example.ochangfactory.tableview;

import androidx.annotation.NonNull;

import com.example.ochangfactory.tableview.model.Cell;
import com.example.ochangfactory.tableview.model.ColumnHeader;
import com.example.ochangfactory.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SamsungTableViewModel_2_1 {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;


    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 18;
    private static final int ROW_SIZE = 20;


    @NonNull
    private List<RowHeader> getSimpleRowHeaderList() {
        List<RowHeader> list = new ArrayList<>();

        String title;
        int i = 0;

        title = "1공장";
        RowHeader header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "2공장";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "UT1동";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "UT2동";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "UT3동";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "UT4동";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "원재료창고";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "해외롤/\n설비자재창고";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "냉각기계실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "위험물\n옥내저장소";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "폐기물\n보관소";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "폐수처리장";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "점착제\n공급실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "위험물\n옥외탱크";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "R.T.O";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "히트펌프실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "가스밸브실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "옥내수전실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "SOHO공정";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "정문동";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        return list;
    }

    /**
     * This is a dummy model list test some cases.
     */
    @NonNull
    private List<ColumnHeader> getRandomColumnHeaderList() {
        List<ColumnHeader> list = new ArrayList<>();

        String title;
        int i = 0;

        title = "연면적(m\u00B2)";
        ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "소화기";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "옥내소화전";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "습식헤드수량(EA)";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "습식밸브";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "준비작동식헤드수량(EA)";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "준비작동식 밸브";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "청정가스설비용기수";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "청정가스설비 구역";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "청정가스 설비 헤드";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "청정가스모듈러용기수";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "청정가스모듈러구역";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "청정가스모듈러헤드";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "화재감지기";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "발신기";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "피난구 유도등";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "통로 유도등";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "비상조명";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);



        /*for (int i = 0; i < COLUMN_SIZE; i++) {
            String title = "column " + i;
            int nRandom = new Random().nextInt();
            if (nRandom % 4 == 0 || nRandom % 3 == 0 || nRandom == i) {
                title = "large column " + i;
            }

            ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
            list.add(header);
        }*/

        return list;
    }

    /**
     * This is a dummy model list test some cases.
     */
    @NonNull
    private List<List<Cell>> getCellListForSortingTest() {
        List<List<Cell>> list = new ArrayList<>();
        for (int i = 0; i < ROW_SIZE; i++) {
            List<Cell> cellList = new ArrayList<>();
            for (int j = 0; j < COLUMN_SIZE; j++) {
                Object text = "cell " + j + " " + i;

                final int random = new Random().nextInt();
                if (j == 0) {
                    if(i == 0) {
                        text = "12,175.97";
                    }
                    if(i == 1) {
                        text = "25,610.52";
                    }
                    if(i == 2) {
                        text = "1,333.21";
                    }
                    if(i == 3) {
                        text = "1,334.98";
                    }
                    if(i == 4) {
                        text = "407.69";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "3,717.64";
                    }
                    if(i == 7) {
                        text = "1,591.61";
                    }
                    if(i == 8) {
                        text = "137.18";
                    }
                    if(i == 9) {
                        text = "569.26";
                    }
                    if(i == 10) {
                        text = "361.38";
                    }
                    if(i == 11) {
                        text = "83.6";
                    }
                    if(i == 12) {
                        text = "114.00";
                    }
                    if(i == 13) {
                        text = "252.13";
                    }
                    if(i == 14) {
                        text = "9450.00";
                    }
                    if(i == 15) {
                        text = "9.6";
                    }
                    if(i == 16) {
                        text = "14.99";
                    }
                    if(i == 17) {
                        text = "369.66";
                    }
                    if(i == 18) {
                        text = "3,095.36";
                    }
                    if(i == 19) {
                        text = "924.44";
                    }
                }
                else if (j == 1) {
                    if(i == 0) {
                        text = "193";
                    }
                    if(i == 1) {
                        text = "247";
                    }
                    if(i == 2) {
                        text = "7";
                    }
                    if(i == 3) {
                        text = "15";
                    }
                    if(i == 4) {
                        text = "9";
                    }
                    if(i == 5) {
                        text = "11";
                    }
                    if(i == 6) {
                        text = "40";
                    }
                    if(i == 7) {
                        text = "13";
                    }
                    if(i == 8) {
                        text = "3";
                    }
                    if(i == 9) {
                        text = "9";
                    }
                    if(i == 10) {
                        text = "9";
                    }
                    if(i == 11) {
                        text = "8";
                    }
                    if(i == 12) {
                        text = "19";
                    }
                    if(i == 13) {
                        text = "10";
                    }
                    if(i == 14) {
                        text = "4";
                    }
                    if(i == 15) {
                        text = "1";
                    }
                    if(i == 16) {
                        text = "1";
                    }
                    if(i == 17) {
                        text = "8";
                    }
                    if(i == 18) {
                        text = "80";
                    }
                    if(i == 19) {
                        text = "31";
                    }
                }
                else if (j == 2) {
                    if(i == 0) {
                        text = "20";
                    }
                    if(i == 1) {
                        text = "58";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "4";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "7";
                    }
                    if(i == 7) {
                        text = "3";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 3) {
                    if(i == 0) {
                        text = "3,005";
                    }
                    if(i == 1) {
                        text = "6,686";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "456";
                    }
                    if(i == 7) {
                        text = "322";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "1";
                    }
                    if(i == 19) {
                        text = "123";
                    }
                }
                else if (j == 4) {
                    if(i == 0) {
                        text = "5";
                    }
                    if(i == 1) {
                        text = "14";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "9";
                    }
                    if(i == 7) {
                        text = "3";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "295";
                    }
                    if(i == 19) {
                        text = "1";
                    }
                }
                else if (j == 5) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 6) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 7) {
                    if(i == 0) {
                        text = "3";
                    }
                    if(i == 1) {
                        text = "18";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "14";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "12";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 8) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 9) {
                    if(i == 0) {
                        text = "2";
                    }
                    if(i == 1) {
                        text = "18";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "7";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "51";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 10) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "2";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "3";
                    }
                    if(i == 4) {
                        text = "7";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "12";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 11) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 12) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "7";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "7";
                    }
                    if(i == 4) {
                        text = "4";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "20";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 13) {
                    if(i == 0) {
                        text = "360";
                    }
                    if(i == 1) {
                        text = "599";
                    }
                    if(i == 2) {
                        text = "38";
                    }
                    if(i == 3) {
                        text = "60";
                    }
                    if(i == 4) {
                        text = "15";
                    }
                    if(i == 5) {
                        text = "4";
                    }
                    if(i == 6) {
                        text = "197";
                    }
                    if(i == 7) {
                        text = "86";
                    }
                    if(i == 8) {
                        text = "3";
                    }
                    if(i == 9) {
                        text = "1";
                    }
                    if(i == 10) {
                        text = "18";
                    }
                    if(i == 11) {
                        text = "3";
                    }
                    if(i == 12) {
                        text = "19";
                    }
                    if(i == 13) {
                        text = "2";
                    }
                    if(i == 14) {
                        text = "2";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "1";
                    }
                    if(i == 17) {
                        text = "18";
                    }
                    if(i == 18) {
                        text = "52";
                    }
                    if(i == 19) {
                        text = "47";
                    }
                }
                else if (j == 14) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }
                else if (j == 15) {
                    if(i == 0) {
                        text = "129";
                    }
                    if(i == 1) {
                        text = "131";
                    }
                    if(i == 2) {
                        text = "5";
                    }
                    if(i == 3) {
                        text = "7";
                    }
                    if(i == 4) {
                        text = "6";
                    }
                    if(i == 5) {
                        text = "7";
                    }
                    if(i == 6) {
                        text = "19";
                    }
                    if(i == 7) {
                        text = "9";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "4";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "5";
                    }
                    if(i == 12) {
                        text = "9";
                    }
                    if(i == 13) {
                        text = "1";
                    }
                    if(i == 14) {
                        text = "1";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "4";
                    }
                    if(i == 18) {
                        text = "55";
                    }
                    if(i == 19) {
                        text = "13";
                    }
                }
                else if (j == 16) {
                    if(i == 0) {
                        text = "47";
                    }
                    if(i == 1) {
                        text = "108";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "1";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "3";
                    }
                    if(i == 6) {
                        text = "5";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "";
                    }
                    if(i == 14) {
                        text = "";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "8";
                    }
                    if(i == 19) {
                        text = "6";
                    }

                }
                else if (j == 17) {
                    if(i == 0) {
                        text = "26";
                    }
                    if(i == 1) {
                        text = "19";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "16";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "1";
                    }
                    if(i == 14) {
                        text = "1";
                    }
                    if(i == 15) {
                        text = "1";
                    }
                    if(i == 16) {
                        text = "1";
                    }
                    if(i == 17) {
                        text = "";
                    }
                    if(i == 18) {
                        text = "55";
                    }
                    if(i == 19) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "";
                    }
                }

                // Create dummy id.
                String id = j + "-" + i;

                Cell cell;

                cell = new Cell(id, text);

                cellList.add(cell);
            }
            list.add(cellList);
        }

        return list;
    }

    @NonNull
    public List<List<Cell>> getCellList() {
        return getCellListForSortingTest();
    }

    @NonNull
    public List<RowHeader> getRowHeaderList() {
        return getSimpleRowHeaderList();
    }

    @NonNull
    public List<ColumnHeader> getColumnHeaderList() {
        return getRandomColumnHeaderList();
    }
}
