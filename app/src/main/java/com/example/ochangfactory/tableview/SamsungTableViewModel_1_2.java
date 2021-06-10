package com.example.ochangfactory.tableview;

import androidx.annotation.NonNull;

import com.example.ochangfactory.tableview.model.Cell;
import com.example.ochangfactory.tableview.model.ColumnHeader;
import com.example.ochangfactory.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SamsungTableViewModel_1_2 {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;


    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 8;
    private static final int ROW_SIZE = 15;


    @NonNull
    private List<RowHeader> getSimpleRowHeaderList() {
        List<RowHeader> list = new ArrayList<>();
        for (int i = 0; i < ROW_SIZE; i++) {
            RowHeader header = new RowHeader(String.valueOf(i),  Integer.toString(i+1));
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

        title = "건축물대장";
        ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "회사";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "주용도";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "층(지하/지상)";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "바닥면적(m\u00B2)";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "연면적(m\u00B2)";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "근무인원";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "비고";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

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
                        text = "주1";
                    }
                    if(i == 1) {
                        text = "주2";
                    }
                    if(i == 2) {
                        text = "부2";
                    }
                    if(i == 3) {
                        text = "부3";
                    }
                    if(i == 4) {
                        text = "부6";
                    }
                    if(i == 5) {
                        text = "부7";
                    }
                    if(i == 6) {
                        text = "부10";
                    }
                    if(i == 7) {
                        text = "부8";
                    }
                    if(i == 8) {
                        text = "부9";
                    }
                    if(i == 9) {
                        text = "부15";
                    }
                    if(i == 10) {
                        text = "부12";
                    }
                    if(i == 11) {
                        text = "부18";
                    }
                    if(i == 12) {
                        text = "부20";
                    }
                    if(i == 13) {
                        text = "부21";
                    }
                    if(i == 14) {
                        text = "부22";
                    }
                }
                else if (j == 1) {
                    if(i == 0) {
                        text = "1공장";
                    }
                    if(i == 1) {
                        text = "2공장";
                    }
                    if(i == 2) {
                        text = "원자재창고";
                    }
                    if(i == 3) {
                        text = "해외롤/\n설비재자창고";
                    }
                    if(i == 4) {
                        text = "U/T 1,4동";
                    }
                    if(i == 5) {
                        text = "U/T 2동";
                    }
                    if(i == 6) {
                        text = "U/T3동";
                    }
                    if(i == 7) {
                        text = "폐기물 보관소";
                    }
                    if(i == 8) {
                        text = "위험물옥내저장소";
                    }
                    if(i == 9) {
                        text = "냉각기계실";
                    }
                    if(i == 10) {
                        text = "폐수처리장";
                    }
                    if(i == 11) {
                        text = "옥내수전실";
                    }
                    if(i == 12) {
                        text = "보안동";
                    }
                    if(i == 13) {
                        text = "SOH";
                    }
                    if(i == 14) {
                        text = "저온창고";
                    }
                }
                else if (j == 2) {
                    if(i == 0) {
                        text = "공장";
                    }
                    if(i == 1) {
                        text = "공장";
                    }
                    if(i == 2) {
                        text = "창고";
                    }
                    if(i == 3) {
                        text = "창고";
                    }
                    if(i == 4) {
                        text = "기계실";
                    }
                    if(i == 5) {
                        text = "기계실";
                    }
                    if(i == 6) {
                        text = "기계실";
                    }
                    if(i == 7) {
                        text = "창고";
                    }
                    if(i == 8) {
                        text = "창고";
                    }
                    if(i == 9) {
                        text = "기계실";
                    }
                    if(i == 10) {
                        text = "창고";
                    }
                    if(i == 11) {
                        text = "기계실";
                    }
                    if(i == 12) {
                        text = "사무";
                    }
                    if(i == 13) {
                        text = "공장";
                    }
                    if(i == 14) {
                        text = "창고";
                    }
                }
                else if (j == 3) {
                    if(i == 0) {
                        text = "0/3";
                    }
                    if(i == 1) {
                        text = "1/3";
                    }
                    if(i == 2) {
                        text = "0/1";
                    }
                    if(i == 3) {
                        text = "0/1";
                    }
                    if(i == 4) {
                        text = "0/2";
                    }
                    if(i == 5) {
                        text = "1/1";
                    }
                    if(i == 6) {
                        text = "0/2";
                    }
                    if(i == 7) {
                        text = "0/1";
                    }
                    if(i == 8) {
                        text = "0/1";
                    }
                    if(i == 9) {
                        text = "0/1";
                    }
                    if(i == 10) {
                        text = "0/1";
                    }
                    if(i == 11) {
                        text = "0/2";
                    }
                    if(i == 12) {
                        text = "0/2";
                    }
                    if(i == 13) {
                        text = "0/3";
                    }
                    if(i == 14) {
                        text = "0/1";
                    }
                }
                else if (j == 4) {
                    if(i == 0) {
                        text = "6,374";
                    }
                    if(i == 1) {
                        text = "9,104";
                    }
                    if(i == 2) {
                        text = "3,717";
                    }
                    if(i == 3) {
                        text = "1,591";
                    }
                    if(i == 4) {
                        text = "1,213";
                    }
                    if(i == 5) {
                        text = "667";
                    }
                    if(i == 6) {
                        text = "269";
                    }
                    if(i == 7) {
                        text = "361";
                    }
                    if(i == 8) {
                        text = "114";
                    }
                    if(i == 9) {
                        text = "137";
                    }
                    if(i == 10) {
                        text = "83";
                    }
                    if(i == 11) {
                        text = "184";
                    }
                    if(i == 12) {
                        text = "422";
                    }
                    if(i == 13) {
                        text = "931";
                    }
                    if(i == 14) {
                        text = "270";
                    }
                }
                else if (j == 5) {
                    if(i == 0) {
                        text = "12,175";
                    }
                    if(i == 1) {
                        text = "25,610";
                    }
                    if(i == 2) {
                        text = "3,717";
                    }
                    if(i == 3) {
                        text = "1,591";
                    }
                    if(i == 4) {
                        text = "1,333";
                    }
                    if(i == 5) {
                        text = "1,334";
                    }
                    if(i == 6) {
                        text = "407";
                    }
                    if(i == 7) {
                        text = "361";
                    }
                    if(i == 8) {
                        text = "114";
                    }
                    if(i == 9) {
                        text = "137";
                    }
                    if(i == 10) {
                        text = "83";
                    }
                    if(i == 11) {
                        text = "369";
                    }
                    if(i == 12) {
                        text = "924";
                    }
                    if(i == 13) {
                        text = "2,824";
                    }
                    if(i == 14) {
                        text = "270";
                    }
                }
                else if (j == 6) {
                    if(i == 0) {
                        text = "220";
                    }
                    if(i == 1) {
                        text = "180";
                    }
                    if(i == 2) {
                        text = "5";
                    }
                    if(i == 3) {
                        text = "6";
                    }
                    if(i == 4) {
                        text = "3";
                    }
                    if(i == 5) {
                        text = "-";
                    }
                    if(i == 6) {
                        text = "-";
                    }
                    if(i == 7) {
                        text = "2";
                    }
                    if(i == 8) {
                        text = "-";
                    }
                    if(i == 9) {
                        text = "-";
                    }
                    if(i == 10) {
                        text = "-";
                    }
                    if(i == 11) {
                        text = "-";
                    }
                    if(i == 12) {
                        text = "10";
                    }
                    if(i == 13) {
                        text = "11";
                    }
                    if(i == 14) {
                        text = "-";
                    }
                }
                else if (j == 7) {
                    if(i == 0) {
                        text = "편광필름 제조";
                    }
                    if(i == 1) {
                        text = "편광필름 제조";
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
                        text = "SOH약품 제조";
                    }
                    if(i == 14) {
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
