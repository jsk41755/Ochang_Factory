package com.example.ochangfactory.tableview;

import androidx.annotation.NonNull;

import com.example.ochangfactory.tableview.model.Cell;
import com.example.ochangfactory.tableview.model.ColumnHeader;
import com.example.ochangfactory.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SamsungTableViewModel_4_1 {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;


    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 6;
    private static final int ROW_SIZE = 10;


    @NonNull
    private List<RowHeader> getSimpleRowHeaderList() {
        List<RowHeader> list = new ArrayList<>();
        String title;
        int i = 0;

        title = "MEK탱크(외곽)";
        RowHeader header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "염산탱크(외곽)";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "1동,2동 용액실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "점착제공급실/\n도공조액실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "점착제공급실/\n도공조액실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "1동,2동 용액실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "폐수처리장";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "SOH";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "SOH";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "1동,2동 용액실";
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

        title = "실명";
        ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
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
                        text = "NEK탱크저장조";
                    }
                    if(i == 1) {
                        text = "염산탱크저장조";
                    }
                    if(i == 2) {
                        text = "용액실";
                   }
                    if(i == 3) {
                        text = "접착제공급실/도공조액실";
                    }
                    if(i == 4) {
                        text = "접착제공급실/도공조액실";
                    }
                    if(i == 5) {
                        text = "용액실";
                    }
                    if(i == 6) {
                        text = "폐수처리장 TMS실";
                    }
                    if(i == 7) {
                        text = "위험물저온창고";
                    }
                    if(i == 8) {
                        text = "메탄올 옥외탱크저장소";
                    }
                    if(i == 9) {
                        text = "용액실";
                    }
                }
                else if (j == 1) {
                    if(i == 0) {
                        text = "MEK";
                    }
                    if(i == 1) {
                        text = "염산";
                    }
                    if(i == 2) {
                        text = "수산화나트륨";
                    }
                    if(i == 3) {
                        text = "아세트산 에틸";
                    }
                    if(i == 4) {
                        text = "톨루엔";
                    }
                    if(i == 5) {
                        text = "질산";
                    }
                    if(i == 6) {
                        text = "황산";
                    }
                    if(i == 7) {
                        text = "황산디에틸";
                    }
                    if(i == 8) {
                        text = "메틸알코올";
                    }
                    if(i == 9) {
                        text = "붕산";
                    }
                }
                else if (j == 2) {
                    if(i == 0) {
                        text = "액체";
                    }
                    if(i == 1) {
                        text = "액체";
                    }
                    if(i == 2) {
                        text = "액체";
                    }
                    if(i == 3) {
                        text = "액체";
                    }
                    if(i == 4) {
                        text = "액체";
                    }
                    if(i == 5) {
                        text = "액체";
                    }
                    if(i == 6) {
                        text = "액체";
                    }
                    if(i == 7) {
                        text = "액체";
                    }
                    if(i == 8) {
                        text = "액체";
                    }
                    if(i == 9) {
                        text = "고체";
                    }
                }
                else if (j == 3) {
                    if(i == 0) {
                        text = "99%";
                    }
                    if(i == 1) {
                        text = "35%";
                    }
                    if(i == 2) {
                        text = "50%";
                    }
                    if(i == 3) {
                        text = "10~82%";
                    }
                    if(i == 4) {
                        text = "1~99%";
                    }
                    if(i == 5) {
                        text = "60%";
                    }
                    if(i == 6) {
                        text = "50%";
                    }
                    if(i == 7) {
                        text = "100%";
                    }
                    if(i == 8) {
                        text = "99%";
                    }
                    if(i == 9) {
                        text = "100%";
                    }
                }
                else if (j == 4) {
                    if(i == 0) {
                        text = "78-93-3";
                    }
                    if(i == 1) {
                        text = "7647-01-0";
                    }
                    if(i == 2) {
                        text = "1310-73-2";
                    }
                    if(i == 3) {
                        text = "141-78-6";
                    }
                    if(i == 4) {
                        text = "108-88-3";
                    }
                    if(i == 5) {
                        text = "7697-37-2";
                    }
                    if(i == 6) {
                        text = "7664-93-9";
                    }
                    if(i == 7) {
                        text = "64-67-5";
                    }
                    if(i == 8) {
                        text = "67-56-1";
                    }
                    if(i == 9) {
                        text = "10043-35-3";
                    }
                }
                else if (j == 5) {
                    if(i == 0) {
                        text = "제조";
                    }
                    if(i == 1) {
                        text = "인프라";
                    }
                    if(i == 2) {
                        text = "제조";
                    }
                    if(i == 3) {
                        text = "제조";
                    }
                    if(i == 4) {
                        text = "제조";
                    }
                    if(i == 5) {
                        text = "제조";
                    }
                    if(i == 6) {
                        text = "인프라";
                    }
                    if(i == 7) {
                        text = "SOH";
                    }
                    if(i == 8) {
                        text = "SOH";
                    }
                    if(i == 9) {
                        text = "제조";
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
