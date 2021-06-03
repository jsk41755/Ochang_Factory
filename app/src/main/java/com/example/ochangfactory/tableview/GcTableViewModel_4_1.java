package com.example.ochangfactory.tableview;

import androidx.annotation.NonNull;

import com.example.ochangfactory.tableview.model.Cell;
import com.example.ochangfactory.tableview.model.ColumnHeader;
import com.example.ochangfactory.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GcTableViewModel_4_1 {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;


    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 7;
    private static final int ROW_SIZE = 114;


    @NonNull
    private List<RowHeader> getSimpleRowHeaderList() {
        List<RowHeader> list = new ArrayList<>();
        for (int i = 0; i < 58; i++) {
            RowHeader header = new RowHeader(String.valueOf(i),  "PD1관");
            list.add(header);
        }

        for (int i = 58; i < 75; i++) {
            RowHeader header = new RowHeader(String.valueOf(i),  "RP1관");
            list.add(header);
        }

        for (int i = 76; i < 82; i++) {
            RowHeader header = new RowHeader(String.valueOf(i),  "RP2관");
            list.add(header);
        }

        for (int i = 82; i < ROW_SIZE; i++) {
            RowHeader header = new RowHeader(String.valueOf(i),  "PD2관");
            list.add(header);
        }

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

        title = "실번호";
        ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "실명";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "취급물질명";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "성상";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "제품농도";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "CAS 번호";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "취급부서";
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
                        text = "경비실";
                    }
                    if(i == 1) {
                        text = "관리관";
                    }
                    if(i == 2) {
                        text = "동물실험실";
                    }
                    if(i == 3) {
                        text = "물류창고";
                    }
                    if(i == 4) {
                        text = "스파인";
                    }
                    if(i == 5) {
                        text = "완제관";
                    }
                    if(i == 6) {
                        text = "유전자제제관";
                    }
                    if(i == 7) {
                        text = "제조지원설비실";
                    }
                    if(i == 8) {
                        text = "폐기물보관소";
                    }
                    if(i == 9) {
                        text = "폐수처리장";
                    }
                    if(i == 10) {
                        text = "혈액제제관";
                    }
                    if(i == 11) {
                        text = "창고";
                    }
                    if(i == 12) {
                        text = "체육관";
                    }
                    if(i == 13) {
                        text = "NBP";
                    }
                    if(i == 14) {
                        text = "QM관";
                    }
                    if(i == 15) {
                        text = "경비동(B부지)";
                    }
                    if(i == 16) {
                        text = "혈액제제2관";
                    }
                    if(i == 17) {
                        text = "통합완제관(W&FF)";
                    }
                    if(i == 18) {
                        text = "위험물저장소";
                    }

                }
                else if (j == 1) {
                    if (i == 0) {
                        text = "정문 경비실";
                    }
                    if (i == 1) {
                        text = "Admin관";
                    }
                    if (i == 2) {
                        text = "동물실험실";
                    }
                    if (i == 3) {
                        text = "Logistics관";
                    }
                    if (i == 4) {
                        text = "스파인";
                    }
                    if (i == 5) {
                        text = "F&F관";
                    }
                    if (i == 6) {
                        text = "RP1관";
                    }
                    if (i == 7) {
                        text = "UT관";
                    }
                    if (i == 8) {
                        text = "폐기물보관소";
                    }
                    if (i == 9) {
                        text = "폐수처리장";
                    }
                    if (i == 10) {
                        text = "PD1관";
                    }
                    if (i == 11) {
                        text = "냉동창고";
                    }
                    if (i == 12) {
                        text = "체육관";
                    }
                    if (i == 13) {
                        text = "RP2관";
                    }
                    if (i == 14) {
                        text = "QM관";
                    }
                    if (i == 15) {
                        text = "후문 경비실";
                    }
                    if (i == 16) {
                        text = "PD2관";
                    }
                    if (i == 17) {
                        text = "통합완제관(W&FF)";
                    }
                    if (i == 18) {
                        text = "위험물저장소";
                    }
                }
                else if (j == 2) {
                    if (i == 0) {
                        text = "경비실";
                    }
                    if (i == 1) {
                        text = "사무동";
                    }
                    if (i == 2) {
                        text = "동물실험동";
                    }
                    if (i == 3) {
                        text = "물류동";
                    }
                    if (i == 4) {
                        text = "통로";
                    }
                    if (i == 5) {
                        text = "충전&포장동";
                    }
                    if (i == 6) {
                        text = "공장동";
                    }
                    if (i == 7) {
                        text = "유틸리티동";
                    }
                    if (i == 8) {
                        text = "폐기물장";
                    }
                    if (i == 9) {
                        text = "폐수처리";
                    }
                    if (i == 10) {
                        text = "공장동";
                    }
                    if (i == 11) {
                        text = "창고동";
                    }
                    if (i == 12) {
                        text = "운동시설";
                    }
                    if (i == 13) {
                        text = "공장동";
                    }
                    if (i == 14) {
                        text = "실험동";
                    }
                    if (i == 15) {
                        text = "경비실";
                    }
                    if (i == 16) {
                        text = "공장동";
                    }
                    if (i == 17) {
                        text = "저장&충전&포장동";
                    }
                    if (i == 18) {
                        text = "공장";
                    }
                }
                else if (j == 3) {
                    if (i == 0) {
                        text = "0/1";
                    }
                    if (i == 1) {
                        text = "1/2";
                    }
                    if (i == 2) {
                        text = "0/2";
                    }
                    if (i == 3) {
                        text = "0/3";
                    }
                    if (i == 4) {
                        text = "0/4";
                    }
                    if (i == 5) {
                        text = "0/4";
                    }
                    if (i == 6) {
                        text = "0/4";
                    }
                    if (i == 7) {
                        text = "0/3";
                    }
                    if (i == 8) {
                        text = "0/1";
                    }
                    if (i == 9) {
                        text = "0/2";
                    }
                    if (i == 10) {
                        text = "0/4";
                    }
                    if (i == 11) {
                        text = "0/1";
                    }
                    if (i == 12) {
                        text = "0/1";
                    }
                    if (i == 13) {
                        text = "1/6";
                    }
                    if (i == 14) {
                        text = "1/3";
                    }
                    if (i == 15) {
                        text = "0/1";
                    }
                    if (i == 16) {
                        text = "1/4";
                    }
                    if (i == 17) {
                        text = "1/7";
                    }
                    if (i == 18) {
                        text = "0/1";
                    }
                }
                else if (j == 4) {
                    if (i == 0) {
                        text = "102.76";
                    }
                    if (i == 1) {
                        text = "1288.9";
                    }
                    if (i == 2) {
                        text = "787.39";
                    }
                    if (i == 3) {
                        text = "3799.25";
                    }
                    if (i == 4) {
                        text = "1940.87";
                    }
                    if (i == 5) {
                        text = "2007.36";
                    }
                    if (i == 6) {
                        text = "1645.42";
                    }
                    if (i == 7) {
                        text = "1811.74";
                    }
                    if (i == 8) {
                        text = "516.8";
                    }
                    if (i == 9) {
                        text = "1069.18";
                    }
                    if (i == 10) {
                        text = "3351.37";
                    }
                    if (i == 11) {
                        text = "239.13";
                    }
                    if (i == 12) {
                        text = "2665.84";
                    }
                    if (i == 13) {
                        text = "2735.07";
                    }
                    if (i == 14) {
                        text = "2346.48";
                    }
                    if (i == 15) {
                        text = "85.84";
                    }
                    if (i == 16) {
                        text = "3924.56";
                    }
                    if (i == 17) {
                        text = "3971.27";
                    }
                    if (i == 18) {
                        text = "149.71";
                    }
                }

                /*else if (j == 4) {
                    if (i == 0) {
                        text = "102.76";
                    }
                    if (i == 1) {
                        text = "1288.9";
                    }
                    if (i == 2) {
                        text = "787.39";
                    }
                    if (i == 3) {
                        text = "3,799.25";
                    }
                    if (i == 4) {
                        text = "1,940.87";
                    }
                    if (i == 5) {
                        text = "2,007.36";
                    }
                    if (i == 6) {
                        text = "1,645.42";
                    }
                    if (i == 7) {
                        text = "1,811.74";
                    }
                    if (i == 8) {
                        text = "516.8";
                    }
                    if (i == 9) {
                        text = "1,069.18";
                    }
                    if (i == 10) {
                        text = "3,351.37";
                    }
                    if (i == 11) {
                        text = "239.13";
                    }
                    if (i == 12) {
                        text = "2,665.84";
                    }
                    if (i == 13) {
                        text = "2,735.07";
                    }
                    if (i == 14) {
                        text = "2,346.48";
                    }
                    if (i == 15) {
                        text = "85.84";
                    }
                    if (i == 16) {
                        text = "3,924.56";
                    }
                    if (i == 17) {
                        text = "3,971.27";
                    }
                    if (i == 18) {
                        text = "149.71";
                    }
                }*/

                else if (j == 5) {
                    if (i == 0) {
                        text = "102.76";
                    }
                    if (i == 1) {
                        text = "2596.65";
                    }
                    if (i == 2) {
                        text = "1477.2";
                    }
                    if (i == 3) {
                        text = "6356.26";
                    }
                    if (i == 4) {
                        text = "3736.5";
                    }
                    if (i == 5) {
                        text = "6031.12";
                    }
                    if (i == 6) {
                        text = "4982.4";
                    }
                    if (i == 7) {
                        text = "3748.34";
                    }
                    if (i == 8) {
                        text = "516.8";
                    }
                    if (i == 9) {
                        text = "1238.15";
                    }
                    if (i == 10) {
                        text = "9797.32";
                    }
                    if (i == 11) {
                        text = "239.13";
                    }
                    if (i == 12) {
                        text = "2665.84";
                    }
                    if (i == 13) {
                        text = "16227.43";
                    }
                    if (i == 14) {
                        text = "9160.9";
                    }
                    if (i == 15) {
                        text = "85.84";
                    }
                    if (i == 16) {
                        text = "19102.27";
                    }
                    if (i == 17) {
                        text = "19992.84";
                    }
                    if (i == 18) {
                        text = "149.71";
                    }
                }

                else if (j == 6) {
                    if (i == 0) {
                        text = "3";
                    }
                    if (i == 1) {
                        text = "58";
                    }
                    if (i == 2) {
                        text = "9";
                    }
                    if (i == 3) {
                        text = "42";
                    }
                    if (i == 4) {
                        text = "0";
                    }
                    if (i == 5) {
                        text = "71";
                    }
                    if (i == 6) {
                        text = "21";
                    }
                    if (i == 7) {
                        text = "53";
                    }
                    if (i == 8) {
                        text = "-";
                    }
                    if (i == 9) {
                        text = "3";
                    }
                    if (i == 10) {
                        text = "159";
                    }
                    if (i == 11) {
                        text = "-";
                    }
                    if (i == 12) {
                        text = "-";
                    }
                    if (i == 13) {
                        text = "62";
                    }
                    if (i == 14) {
                        text = "203";
                    }
                    if (i == 15) {
                        text = "2";
                    }
                    if (i == 16) {
                        text = "49";
                    }
                    if (i == 17) {
                        text = "31";
                    }
                    if (i == 18) {
                        text = "-";
                    }
                }

                else if (j == 7) {
                    if (i == 0) {
                        text = "";
                    }
                    if (i == 1) {
                        text = "";
                    }
                    if (i == 2) {
                        text = "";
                    }
                    if (i == 3) {
                        text = "생산완제품보관";
                    }
                    if (i == 4) {
                        text = "";
                    }
                    if (i == 5) {
                        text = "알부민 주, 아이비글로불린 주 등";
                    }
                    if (i == 6) {
                        text = "뉴라펙, 그린진에프";
                    }
                    if (i == 7) {
                        text = "";
                    }
                    if (i == 8) {
                        text = "";
                    }
                    if (i == 9) {
                        text = "";
                    }
                    if (i == 10) {
                        text = "알부민 주, 아이비글로불린 주 등";
                    }
                    if (i == 11) {
                        text = "";
                    }
                    if (i == 12) {
                        text = "";
                    }
                    if (i == 13) {
                        text = "헌터라제";
                    }
                    if (i == 14) {
                        text = "시험";
                    }
                    if (i == 15) {
                        text = "";
                    }
                    if (i == 16) {
                        text = "알부민 주, 아이비글로불린 주, 그린모노";
                    }
                    if (i == 17) {
                        text = "";
                    }
                    if (i == 18) {
                        text = "";
                    }
                }

                // Create dummy id.
                String id = j + "-" + i;

                Cell cell;

                cell = new Cell(id, text);
                /*if (j == 3) {
                    cell = new Cell(id, text);
                } else if (j == 4) {
                    // NOTE female and male keywords for filter will have conflict since "female"
                    // contains "male"
                    cell = new Cell(id, text);
                } else {
                    cell = new Cell(id, text);
                }*/
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
