package com.example.ochangfactory.tableview;

import androidx.annotation.NonNull;

import com.example.ochangfactory.tableview.model.Cell;
import com.example.ochangfactory.tableview.model.ColumnHeader;
import com.example.ochangfactory.tableview.model.RowHeader;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GcTableViewModel_2_1 {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;


    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 18;
    private static final int ROW_SIZE = 18;


    @NonNull
    private List<RowHeader> getSimpleRowHeaderList() {
        List<RowHeader> list = new ArrayList<>();

        String title;
        int i = 0;

        title = "정문 경비실";
        RowHeader header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "Admin관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "동물실험실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "Logistics관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "스파인";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "F&F관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "RP1관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "UT관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "폐기물보관소";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "폐수처리장";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "PD1관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "냉동창고";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "체육관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "RP2관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "QM관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "후문 경비실";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "PD2관";
        header = new RowHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "통합완제관(W&FF)";
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
                        text = "102.76";
                    }
                    if(i == 1) {
                        text = "2596.65";
                    }
                    if(i == 2) {
                        text = "1477.2";
                    }
                    if(i == 3) {
                        text = "6356.26";
                    }
                    if(i == 4) {
                        text = "3736.5";
                    }
                    if(i == 5) {
                        text = "6031.12";
                    }
                    if(i == 6) {
                        text = "4982.4";
                    }
                    if(i == 7) {
                        text = "3748.34";
                    }
                    if(i == 8) {
                        text = "516.8";
                    }
                    if(i == 9) {
                        text = "1238.15";
                    }
                    if(i == 10) {
                        text = "9797.32";
                    }
                    if(i == 11) {
                        text = "239.13";
                    }
                    if(i == 12) {
                        text = "2665.84";
                    }
                    if(i == 13) {
                        text = "16227.43";
                    }
                    if(i == 14) {
                        text = "9160.9";
                    }
                    if(i == 15) {
                        text = "85.84";
                    }
                    if(i == 16) {
                        text = "19102.27";
                    }
                    if(i == 17) {
                        text = "19992.84";
                    }
                }
                else if (j == 1) {
                    if(i == 0) {
                        text = "2";
                    }
                    if(i == 1) {
                        text = "22";
                    }
                    if(i == 2) {
                        text = "30";
                    }
                    if(i == 3) {
                        text = "39";
                    }
                    if(i == 4) {
                        text = "13";
                    }
                    if(i == 5) {
                        text = "47";
                    }
                    if(i == 6) {
                        text = "53";
                    }
                    if(i == 7) {
                        text = "35";
                    }
                    if(i == 8) {
                        text = "5";
                    }
                    if(i == 9) {
                        text = "12";
                    }
                    if(i == 10) {
                        text = "101";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "11";
                    }
                    if(i == 13) {
                        text = "87";
                    }
                    if(i == 14) {
                        text = "112";
                    }
                    if(i == 15) {
                        text = "2";
                    }
                    if(i == 16) {
                        text = "169";
                    }
                    if(i == 17) {
                        text = "163";
                    }
                }
                else if (j == 2) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "6";
                    }
                    if(i == 2) {
                        text = "6";
                    }
                    if(i == 3) {
                        text = "14";
                    }
                    if(i == 4) {
                        text = "19";
                    }
                    if(i == 5) {
                        text = "11";
                    }
                    if(i == 6) {
                        text = "14";
                    }
                    if(i == 7) {
                        text = "7";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "21";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "36";
                    }
                    if(i == 14) {
                        text = "16";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "30";
                    }
                    if(i == 17) {
                        text = "39";
                    }
                }
                else if (j == 3) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "346";
                    }
                    if(i == 2) {
                        text = "";
                    }
                    if(i == 3) {
                        text = "";
                    }
                    if(i == 4) {
                        text = "1005";
                    }
                    if(i == 5) {
                        text = "";
                    }
                    if(i == 6) {
                        text = "";
                    }
                    if(i == 7) {
                        text = "567";
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
                }
                else if (j == 4) {
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
                        text = "";
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
                        text = "4";
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
                        text = "1,593";
                    }
                    if(i == 4) {
                        text = "";
                    }
                    if(i == 5) {
                        text = "1,404";
                    }
                    if(i == 6) {
                        text = "1,121";
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
                        text = "2,201";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "392";
                    }
                    if(i == 13) {
                        text = "2,933";
                    }
                    if(i == 14) {
                        text = "2,156";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "4,519";
                    }
                    if(i == 17) {
                        text = "5,802";
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
                        text = "4";
                    }
                    if(i == 4) {
                        text = "1";
                    }
                    if(i == 5) {
                        text = "3";
                    }
                    if(i == 6) {
                        text = "3";
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
                        text = "6";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "1";
                    }
                    if(i == 13) {
                        text = "7";
                    }
                    if(i == 14) {
                        text = "4";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "11";
                    }
                    if(i == 17) {
                        text = "11";
                    }
                }
                else if (j == 7) {
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
                        text = "";
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
                        text = "42";
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
                        text = "16";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "43";
                    }
                    if(i == 17) {
                        text = "23";
                    }
                }
                else if (j == 8) {
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
                        text = "";
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
                        text = "4";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "3";
                    }
                    if(i == 17) {
                        text = "4";
                    }
                }
                else if (j == 9) {
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
                        text = "44";
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
                        text = "32";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "48";
                    }
                    if(i == 17) {
                        text = "29";
                    }
                }
                else if (j == 10) {
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
                        text = "1";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "5";
                    }
                    if(i == 17) {
                        text = "7";
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
                        text = "1";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "4";
                    }
                    if(i == 17) {
                        text = "6";
                    }
                }
                else if (j == 12) {
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
                        text = "2";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "12";
                    }
                    if(i == 17) {
                        text = "14";
                    }
                }
                else if (j == 13) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "65";
                    }
                    if(i == 2) {
                        text = "75";
                    }
                    if(i == 3) {
                        text = "236";
                    }
                    if(i == 4) {
                        text = "30";
                    }
                    if(i == 5) {
                        text = "649";
                    }
                    if(i == 6) {
                        text = "580";
                    }
                    if(i == 7) {
                        text = "42";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "1,143";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "21";
                    }
                    if(i == 13) {
                        text = "1,210";
                    }
                    if(i == 14) {
                        text = "684";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "1,141";
                    }
                    if(i == 17) {
                        text = "975";
                    }
                }
                else if (j == 14) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "6";
                    }
                    if(i == 2) {
                        text = "6";
                    }
                    if(i == 3) {
                        text = "14";
                    }
                    if(i == 4) {
                        text = "10";
                    }
                    if(i == 5) {
                        text = "11";
                    }
                    if(i == 6) {
                        text = "14";
                    }
                    if(i == 7) {
                        text = "7";
                    }
                    if(i == 8) {
                        text = "2";
                    }
                    if(i == 9) {
                        text = "2";
                    }
                    if(i == 10) {
                        text = "21";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "36";
                    }
                    if(i == 14) {
                        text = "14";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "30";
                    }
                    if(i == 17) {
                        text = "39";
                    }
                }
                else if (j == 15) {
                    if(i == 0) {
                        text = "5";
                    }
                    if(i == 1) {
                        text = "41";
                    }
                    if(i == 2) {
                        text = "72";
                    }
                    if(i == 3) {
                        text = "36";
                    }
                    if(i == 4) {
                        text = "6";
                    }
                    if(i == 5) {
                        text = "123";
                    }
                    if(i == 6) {
                        text = "136";
                    }
                    if(i == 7) {
                        text = "37";
                    }
                    if(i == 8) {
                        text = "2";
                    }
                    if(i == 9) {
                        text = "6";
                    }
                    if(i == 10) {
                        text = "226";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "6";
                    }
                    if(i == 13) {
                        text = "95";
                    }
                    if(i == 14) {
                        text = "162";
                    }
                    if(i == 15) {
                        text = "5";
                    }
                    if(i == 16) {
                        text = "321";
                    }
                    if(i == 17) {
                        text = "200";
                    }
                }
                else if (j == 16) {
                    if(i == 0) {
                        text = "1";
                    }
                    if(i == 1) {
                        text = "7";
                    }
                    if(i == 2) {
                        text = "12";
                    }
                    if(i == 3) {
                        text = "30";
                    }
                    if(i == 4) {
                        text = "11";
                    }
                    if(i == 5) {
                        text = "15";
                    }
                    if(i == 6) {
                        text = "32";
                    }
                    if(i == 7) {
                        text = "22";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "2";
                    }
                    if(i == 10) {
                        text = "52";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "9";
                    }
                    if(i == 13) {
                        text = "66";
                    }
                    if(i == 14) {
                        text = "44";
                    }
                    if(i == 15) {
                        text = "1";
                    }
                    if(i == 16) {
                        text = "102";
                    }
                    if(i == 17) {
                        text = "159";
                    }
                }
                else if (j == 17) {
                    if(i == 0) {
                        text = "";
                    }
                    if(i == 1) {
                        text = "172";
                    }
                    if(i == 2) {
                        text = "271";
                    }
                    if(i == 3) {
                        text = "192";
                    }
                    if(i == 4) {
                        text = "67";
                    }
                    if(i == 5) {
                        text = "114";
                    }
                    if(i == 6) {
                        text = "95";
                    }
                    if(i == 7) {
                        text = "102";
                    }
                    if(i == 8) {
                        text = "";
                    }
                    if(i == 9) {
                        text = "";
                    }
                    if(i == 10) {
                        text = "197";
                    }
                    if(i == 11) {
                        text = "";
                    }
                    if(i == 12) {
                        text = "";
                    }
                    if(i == 13) {
                        text = "231";
                    }
                    if(i == 14) {
                        text = "19";
                    }
                    if(i == 15) {
                        text = "";
                    }
                    if(i == 16) {
                        text = "389";
                    }
                    if(i == 17) {
                        text = "663";
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
