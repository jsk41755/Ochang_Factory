package com.example.ochangfactory.tableview;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import com.example.ochangfactory.R;
import com.example.ochangfactory.tableview.model.Cell;
import com.example.ochangfactory.tableview.model.ColumnHeader;
import com.example.ochangfactory.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SamsungTableViewModel_3_1 {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;


    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 7;
    private static final int ROW_SIZE = 16;


    @NonNull
    private List<RowHeader> getSimpleRowHeaderList() {
        List<RowHeader> list = new ArrayList<>();
        String title;
        int i = 0;

        title = "5";
        RowHeader header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "5";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "5";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "5";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "5";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "3";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "2";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "4";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "6";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "6";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "6";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "6";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "6";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "7";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "8";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "-";
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

        title = "위험물 시설 명";
        ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "내부 명칭칭";
       header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "허가수량";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "위험물 류별";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "설치허가일";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "(설치허가 번호)";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "안전관리자";
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
                        text = "위험물 옥외탱크\n저장소①";
                    }
                    if(i == 1) {
                        text = "위험물 옥외탱크\n저장소②";
                    }
                    if(i == 2) {
                        text = "위험물 옥외탱크\n저장소③";
                    }
                    if(i == 3) {
                        text = "위험물 옥외탱크\n저장소④";
                    }
                    if(i == 4) {
                        text = "위험물 일반취급소";
                    }
                    if(i == 5) {
                        text = "위험물 일반취급소";
                    }
                    if(i == 6) {
                        text = "위험물 옥내탱크\n저장소";
                    }
                    if(i == 7) {
                        text = "위험물 일반취급소";
                    }
                    if(i == 8) {
                        text = "옥외탱크 저장소①";
                    }
                    if(i == 9) {
                        text = "옥외탱크 저장소②";
                    }
                    if(i == 10) {
                        text = "옥외탱크 저장소③";
                    }
                    if(i == 11) {
                        text = "옥외탱크 저장소④";
                    }
                    if(i == 12) {
                        text = "옥외탱크 저장소⑤";
                    }
                    if(i == 13) {
                        text = "제조소";
                    }
                    if(i == 14) {
                        text = "옥내저장소";
                    }
                    if(i == 15) {
                        text = "(충전하는) 일반취급소";
                    }
                }
                else if (j == 1) {
                    if(i == 0) {
                        text = "MEK 탱크";
                    }
                    if(i == 1) {
                        text = "MEK 탱크";
                    }
                    if(i == 2) {
                        text = "MEK 탱크";
                    }
                    if(i == 3) {
                        text = "폐MEK 탱크";
                    }
                    if(i == 4) {
                        text = "점착체 공급실";
                    }
                    if(i == 5) {
                        text = "도공 조액실";
                    }
                    if(i == 6) {
                        text = "점착제 저장탱크";
                    }
                    if(i == 7) {
                        text = "점착제 저장소";
                    }
                    if(i == 8) {
                        text = "HEXANE";
                    }
                    if(i == 9) {
                        text = "메탄올";
                    }
                    if(i == 10) {
                        text = "PGMEA";
                    }
                    if(i == 11) {
                        text = "ANONE";
                    }
                    if(i == 12) {
                        text = "SOH폐액";
                    }
                    if(i == 13) {
                        text = "제조소";
                    }
                    if(i == 14) {
                        text = "옥내저장소";
                    }
                    if(i == 15) {
                        text = "SOH폐액";
                    }
                }
                else if (j == 2) {
                    if(i == 0) {
                        text = "20,000";
                    }
                    if(i == 1) {
                        text = "20,000";
                    }
                    if(i == 2) {
                        text = "30,000";
                    }
                    if(i == 3) {
                        text = "30,000";
                    }
                    if(i == 4) {
                        text = "25,200";
                    }
                    if(i == 5) {
                        text = "22,750";
                    }
                    if(i == 6) {
                        text = "19,500";
                    }
                    if(i == 7) {
                        text = "383,434";
                    }
                    if(i == 8) {
                        text = "20,000";
                    }
                    if(i == 9) {
                        text = "20,000";
                    }
                    if(i == 10) {
                        text = "30,000";
                    }
                    if(i == 11) {
                        text = "30,000";
                    }
                    if(i == 12) {
                        text = "30,000";
                    }
                    if(i == 13) {
                        text = "27,500";
                    }
                    if(i == 14) {
                        text = "54,310";
                    }
                    if(i == 15) {
                        text = "30,000";
                    }
                }
                else if (j == 3) {
                    if(i == 0) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 1) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 2) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 3) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 4) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 5) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 6) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 7) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 8) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 9) {
                        text = "제4류 알코올류";
                    }
                    if(i == 10) {
                        text = "제4류 제2석유류";
                    }
                    if(i == 11) {
                        text = "제4류 제2석유류";
                    }
                    if(i == 12) {
                        text = "제4류 제2석유류";
                    }
                    if(i == 13) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 14) {
                        text = "제4류 제1석유류";
                    }
                    if(i == 14) {
                        text = "제4류 제2석유류";
                    }
                }
                else if (j == 4) {
                    if(i == 0) {
                        text = "04.05.03";
                    }
                    if(i == 1) {
                        text = "04.05.03";
                    }
                    if(i == 2) {
                        text = "05.07.28";
                    }
                    if(i == 3) {
                        text = "07.08.07";
                    }
                    if(i == 4) {
                        text = "14.08.20";
                    }
                    if(i == 5) {
                        text = "07.10.18";
                    }
                    if(i == 6) {
                        text = "10.02.03";
                    }
                    if(i == 7) {
                        text = "07.10.18";
                    }
                    if(i == 8) {
                        text = "18.01.04";
                    }
                    if(i == 9) {
                        text = "18.01.04";
                    }
                    if(i == 10) {
                        text = "18.01.04";
                    }
                    if(i == 11) {
                        text = "18.01.04";
                    }
                    if(i == 12) {
                        text = "18.01.04";
                    }
                    if(i == 13) {
                        text = "18.01.19";
                    }
                    if(i == 14) {
                        text = "18.01.04";
                    }
                    if(i == 15) {
                        text = "18.01.04";
                    }
                }
                else if (j == 5) {
                    if(i == 0) {
                        text = "제22-1222-\n040503호";
                    }
                    if(i == 1) {
                        text = "제22-1223-\n040503호";
                    }
                    if(i == 2) {
                        text = "제22-1740-\n050728호";
                    }
                    if(i == 3) {
                        text = "제22-2003-\n070807호";
                    }
                    if(i == 4) {
                        text = "제34-2526-\n140820호";
                    }
                    if(i == 5) {
                        text = "제34-2031-\n071018호";
                    }
                    if(i == 6) {
                        text = "제23-2211-\n100203호";
                    }
                    if(i == 7) {
                        text = "제21-2032-\n071018호";
                    }
                    if(i == 8) {
                        text = "제22-2657-\n180104호";
                    }
                    if(i == 9) {
                        text = "제22-2658-\n180104호";
                    }
                    if(i == 10) {
                        text = "제22-2659-\n180104호";
                    }
                    if(i == 11) {
                        text = "제22-2660-\n180104호";
                    }
                    if(i == 12) {
                        text = "제22-2661-\n180104호";
                    }
                    if(i == 13) {
                        text = "제10-2663-\n180419호";
                    }
                    if(i == 14) {
                        text = "제21-2662-\n180104호";
                    }
                    if(i == 15) {
                        text = "제34-2664-\n180104호";
                    }
                }
                else if (j == 6) {
                    if(i == 0) {
                        text = "장문석\n프로";
                    }
                    if(i == 1) {
                        text = "장문석\n프로";
                    }
                    if(i == 2) {
                        text = "장문석\n프로";
                    }
                    if(i == 3) {
                        text = "장문석\n프로";
                    }
                    if(i == 4) {
                        text = "이종영\n프로";
                    }
                    if(i == 5) {
                        text = "이종영\n프로";
                    }
                    if(i == 6) {
                        text = "이종영\n프로";
                    }
                    if(i == 7) {
                        text = "이종영\n프로";
                    }
                    if(i == 8) {
                        text = "정민영\n프로";
                    }
                    if(i == 9) {
                        text = "정민영\n프로";
                    }
                    if(i == 10) {
                        text = "정민영\n프로";
                    }
                    if(i == 11) {
                        text = "정민영\n프로";
                    }
                    if(i == 12) {
                        text = "정효원\n프로";
                    }
                    if(i == 13) {
                        text = "정효원\n프로";
                    }
                    if(i == 14) {
                        text = "정효원\n프로";
                    }
                    if(i == 15) {
                        text = "정효원\n프로";
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
