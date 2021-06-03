/*
 * MIT License
 *
 * Copyright (c) 2021 Evren Coşkun
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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

/**
 * Created by evrencoskun on 4.02.2018.
 */

public class TableViewModel {

    // Columns indexes
    public static final int MOOD_COLUMN_INDEX = 3;
    public static final int GENDER_COLUMN_INDEX = 4;

    // Constant values for icons
    public static final int SAD = 1;
    public static final int HAPPY = 2;
    public static final int BOY = 1;
    public static final int GIRL = 2;

    // Constant size for dummy data sets
    private static final int COLUMN_SIZE = 10;
    private static final int ROW_SIZE = 29;

    // Drawables
    @DrawableRes
    private final int mBoyDrawable;
    @DrawableRes
    private final int mGirlDrawable;
    @DrawableRes
    private final int mHappyDrawable;
    @DrawableRes
    private final int mSadDrawable;

    public TableViewModel() {
        // initialize drawables
        mBoyDrawable = R.drawable.ic_male;
        mGirlDrawable = R.drawable.ic_female;
        mHappyDrawable = R.drawable.ic_happy;
        mSadDrawable = R.drawable.ic_sad;
    }

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

        title = "위치";
        ColumnHeader header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "구분";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "허가번호";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "설치일자";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "설치허가\n번호";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "위험물종류";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "허가수량";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "용도";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "위험물 \n관리자";
        header = new ColumnHeader(String.valueOf(i), title);
        i++;
        list.add(header);

        title = "비고";
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
                        text = "RP2관 PD1관 사이";
                    }
                    if(i == 1) {
                        text = "RP2관 PD1관 사이";
                    }
                    if(i == 2) {
                        text = "RP2관 앞";
                    }
                    if(i == 3) {
                        text = "창고 뒤";
                    }
                    if(i == 4) {
                        text = "창고 뒤";
                    }
                    if(i == 5) {
                        text = "RP2관 PD1관 사이";
                    }
                    if(i == 6) {
                        text = "RP2관 PD1관 사이";
                    }
                    if(i == 7) {
                        text = "RP2관 앞";
                    }
                    if(i == 8) {
                        text = "RP2관 앞";
                    }
                    if(i == 9) {
                        text = "RP2관 PD1관 사이";
                    }
                    if(i == 10) {
                        text = "RP2관 앞";
                    }
                    if(i == 11) {
                        text = "RP2관 앞";
                    }
                    if(i == 12) {
                        text = "RP2관 앞";
                    }
                    if(i == 13) {
                        text = "RP2관 앞";
                    }
                    if(i == 14) {
                        text = "RP2관 옆";
                    }
                    if(i == 15) {
                        text = "RP2관 옆";
                    }
                    if(i == 16) {
                        text = "RP2관 옆";
                    }
                    if(i == 17) {
                        text = "RP2관 옆";
                    }
                    if(i == 18) {
                        text = "RP2관 뒤";
                    }
                    if(i == 19) {
                        text = "RP2관 뒤";
                    }
                    if(i == 20) {
                        text = "RP2관 뒤";
                    }
                    if(i == 21) {
                        text = "RP2관 뒤";
                    }
                    if(i == 22) {
                        text = "RP2관 뒤";
                    }
                    if(i == 23) {
                        text = "RP2관 뒤";
                    }
                    if(i == 24) {
                        text = "RP2관 뒤";
                    }
                    if(i == 25) {
                        text = "RP2관 뒤";
                    }
                    if(i == 26) {
                        text = "RP2관 뒤";
                    }
                    if(i == 27) {
                        text = "RP2관 뒤";
                    }
                    if(i == 28) {
                        text = "RP2관 뒤";
                    }

                }
                else if (j == 1) {
                    if (i == 0) {
                        text = "옥외탱크저장소";
                    }
                    if (i == 1) {
                        text = "지하탱크저장소";
                    }
                    if (i == 2) {
                        text = "옥외탱크저장소(경유)";
                    }
                    if (i == 3) {
                        text = "옥외저장소";
                    }
                    if (i == 4) {
                        text = "옥외저장소";
                    }
                    if (i == 5) {
                        text = "제조소";
                    }
                    if (i == 6) {
                        text = "제조소";
                    }
                    if (i == 7) {
                        text = "지하탱크저장소";
                    }
                    if (i == 8) {
                        text = "지하탱크저장소";
                    }
                    if (i == 9) {
                        text = "옥외탱크저장소(ET-112)";
                    }
                    if (i == 10) {
                        text = "옥외탱크저장소(ET-104)";
                    }
                    if (i == 11) {
                        text = "옥외탱크저장소(ET-103)";
                    }
                    if (i == 12) {
                        text = "옥외탱크저장소(ET-102)";
                    }
                    if (i == 13) {
                        text = "옥외탱크저장소(ET-101)";
                    }
                    if (i == 14) {
                        text = "옥내저장소";
                    }
                    if (i == 15) {
                        text = "옥내저장소";
                    }
                    if (i == 16) {
                        text = "옥내저장소";
                    }
                    if (i == 17) {
                        text = "옥내저장소";
                    }
                    if(i == 18) {
                        text = "제조소";
                    }
                    if(i == 19) {
                        text = "옥외탱크저장소(ET-101)";
                    }
                    if(i == 20) {
                        text = "옥외탱크저장소(ET-102)";
                    }
                    if(i == 21) {
                        text = "옥외탱크저장소(ET-103)";
                    }
                    if(i == 22) {
                        text = "옥외탱크저장소(ET-104)";
                    }
                    if(i == 23) {
                        text = "옥외탱크저장소(ET-105)";
                    }
                    if(i == 24) {
                        text = "옥외탱크저장소(ET-106)";
                    }
                    if(i == 25) {
                        text = "옥외탱크저장소(ET-107)";
                    }
                    if(i == 26) {
                        text = "지하탱크저장소";
                    }
                    if(i == 27) {
                        text = "지하탱크저장소";
                    }
                    if(i == 28) {
                        text = "옥외탱크저장소(경유)";
                    }
                }
                else if (j == 2) {
                    if (i == 0) {
                        text = "제22-2065-080311호";
                    }
                    if (i == 1) {
                        text = "제24-2064-080311호";
                    }
                    if (i == 2) {
                        text = "제22-2352-120613호";
                    }
                    if (i == 3) {
                        text = "제27-2434-131022호";
                    }
                    if (i == 4) {
                        text = "제27-2434-131022호";
                    }
                    if (i == 5) {
                        text = "제10-2063-140905호";
                    }
                    if (i == 6) {
                        text = "제10-2063-140905호";
                    }
                    if (i == 7) {
                        text = "제24-2514-140905호";
                    }
                    if (i == 8) {
                        text = "제24-2514-140905호";
                    }
                    if (i == 9) {
                        text = "제22-2515-140905호";
                    }
                    if (i == 10) {
                        text = "제22-2513-140905호";
                    }
                    if (i == 11) {
                        text = "제22-2512-140905호";
                    }
                    if (i == 12) {
                        text = "제22-2511-140905호";
                    }
                    if (i == 13) {
                        text = "제22-2510-140905호";
                    }
                    if (i == 14) {
                        text = "제21-2784-200507호";
                    }
                    if (i == 15) {
                        text = "제21-2784-200507호";
                    }
                    if (i == 16) {
                        text = "제21-2784-200507호";
                    }
                    if (i == 17) {
                        text = "제21-2784-200507호";
                    }
                    if (i == 18) {
                        text = "제10-2566-160412호";
                    }
                    if(i == 19) {
                        text = "제22-2576-160412호";
                    }
                    if(i == 20) {
                        text = "제22-2577-160412호";
                    }
                    if(i == 21) {
                        text = "제22-2578-160412호";
                    }
                    if(i == 22) {
                        text = "제22-2579-160412호";
                    }
                    if(i == 23) {
                        text = "제22-2580-160412호";
                    }
                    if(i == 24) {
                        text = "제22-2581-160412호";
                    }
                    if(i == 25) {
                        text = "제22-2582-160412호";
                    }
                    if(i == 26) {
                        text = "제24-2565-160412호";
                    }
                    if(i == 27) {
                        text = "제24-2565-160412호";
                    }
                    if(i == 28) {
                        text = "제22- 2575-160419호";
                    }
                }
                else if (j == 3) {
                    if (i == 0) {
                        text = "2007.12.31";
                    }
                    if (i == 1) {
                        text = "2007.12.31";
                    }
                    if (i == 2) {
                        text = "2012.04.25";
                    }
                    if (i == 3) {
                        text = "2013.08.19";
                    }
                    if (i == 4) {
                        text = "2013.08.19";
                    }
                    if (i == 5) {
                        text = "2014.07.14";
                    }
                    if (i == 6) {
                        text = "2014.07.14";
                    }
                    if (i == 7) {
                        text = "2014.07.01";
                    }
                    if (i == 8) {
                        text = "2014.07.01";
                    }
                    if (i == 9) {
                        text = "2014.07.14";
                    }
                    if (i == 10) {
                        text = "2014.07.01";
                    }
                    if (i == 11) {
                        text = "2014.07.01";
                    }
                    if (i == 12) {
                        text = "2014.07.01";
                    }
                    if (i == 13) {
                        text = "2014.07.01";
                    }
                    if (i == 14) {
                        text = "2020.04.13";
                    }
                    if (i == 15) {
                        text = "2020.04.13";
                    }
                    if (i == 16) {
                        text = "2020.04.13";
                    }
                    if (i == 17) {
                        text = "2020.04.13";
                    }
                    if (i == 18) {
                        text = "2015.09.10";
                    }
                    if(i == 19) {
                        text = "2015.10.23";
                    }
                    if(i == 20) {
                        text = "2015.10.23";
                    }
                    if(i == 21) {
                        text = "2015.10.23";
                    }
                    if(i == 22) {
                        text = "2015.10.23";
                    }
                    if(i == 23) {
                        text = "2015.10.23";
                    }
                    if(i == 24) {
                        text = "2015.10.23";
                    }
                    if(i == 25) {
                        text = "2015.10.23";
                    }
                    if(i == 26) {
                        text = "2015.10.23";
                    }
                    if(i == 27) {
                        text = "2015.10.23";
                    }
                    if(i == 28) {
                        text = "2015.10.23";
                    }
                }
                else if (j == 4) {
                    if (i == 0) {
                        text = "제22-2065-071231호";
                    }
                    if (i == 1) {
                        text = "제24-2064-071231호";
                    }
                    if (i == 2) {
                        text = "제22-2352-120425호";
                    }
                    if (i == 3) {
                        text = "제27-2434-130819호";
                    }
                    if (i == 4) {
                        text = "제27-2434-130819호";
                    }
                    if (i == 5) {
                        text = "제10-2063-140714호";
                    }
                    if (i == 6) {
                        text = "제10-2063-140714호";
                    }
                    if (i == 7) {
                        text = "제24-2514-140701호";
                    }
                    if (i == 8) {
                        text = "제24-2514-140701호";
                    }
                    if (i == 9) {
                        text = "제22-2515-140714호";
                    }
                    if (i == 10) {
                        text = "제22-2513-140701호";
                    }
                    if (i == 11) {
                        text = "제22-2512-140701호";
                    }
                    if (i == 12) {
                        text = "제22-2511-140701호";
                    }
                    if (i == 13) {
                        text = "제22-2510-140701호";
                    }
                    if (i == 14) {
                        text = "제21-2784-200413호";
                    }
                    if (i == 15) {
                        text = "제21-2784-200413호";
                    }
                    if (i == 16) {
                        text = "제21-2784-200413호";
                    }
                    if (i == 17) {
                        text = "제21-2784-200413호";
                    }
                    if (i == 18) {
                        text = "제10-2566-150910호";
                    }
                    if(i == 19) {
                        text = "제22-2576-151023호";
                    }
                    if(i == 20) {
                        text = "제22-2577-151023호";
                    }
                    if(i == 21) {
                        text = "제22-2578-151023호";
                    }
                    if(i == 22) {
                        text = "제22-2579-151023호";
                    }
                    if(i == 23) {
                        text = "제22-2580-151023호";
                    }
                    if(i == 24) {
                        text = "제22-2581-151023호";
                    }
                    if(i == 25) {
                        text = "제22-2582-151023호";
                    }
                    if(i == 26) {
                        text = "제24-2565-150910호";
                    }
                    if(i == 27) {
                        text = "제24-2565-150910호";
                    }
                    if(i == 28) {
                        text = "제22-2575-151023호";
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
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 1) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 2) {
                        text = "제4류 제2석유류(경유)";
                    }
                    if (i == 3) {
                        text = "제4류 제3석유류 (프로필렌글리콜)";
                    }
                    if (i == 4) {
                        text = "제4류 제4석유류(기어오일)";
                    }
                    if (i == 5) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 6) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 7) {
                        text = "제4류 알코올류 (재생에탄올)";
                    }
                    if (i == 8) {
                        text = "제4류 알코올류 (재생에탄올)";
                    }
                    if (i == 9) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 10) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 11) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 12) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 13) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 14) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if (i == 15) {
                        text = "제4류 2석유류(수용성)";
                    }
                    if (i == 16) {
                        text = "제4류 3석유류(수용성)";
                    }
                    if (i == 17) {
                        text = "제4류 4석유류";
                    }
                    if (i == 18) {
                        text = "제4류 알코올류";
                    }
                    if(i == 19) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 20) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 21) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 22) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 23) {
                        text = "제4류 알코올류";
                    }
                    if(i == 24) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 25) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 26) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 27) {
                        text = "제4류 알코올류(에탄올)";
                    }
                    if(i == 28) {
                        text = "제4류 2석유류(경유)";
                    }
                }

                else if (j == 6) {
                    if (i == 0) {
                        text = "7,900";
                    }
                    if (i == 1) {
                        text = "19,500";
                    }
                    if (i == 2) {
                        text = "18,000";
                    }
                    if (i == 3) {
                        text = "3,000";
                    }
                    if (i == 4) {
                        text = "1,600";
                    }
                    if (i == 5) {
                        text = "4,000";
                    }
                    if (i == 6) {
                        text = "5,000";
                    }
                    if (i == 7) {
                        text = "25,000";
                    }
                    if (i == 8) {
                        text = "35,500";
                    }
                    if (i == 9) {
                        text = "3,270";
                    }
                    if (i == 10) {
                        text = "10,000";
                    }
                    if (i == 11) {
                        text = "10,000";
                    }
                    if (i == 12) {
                        text = "10,000";
                    }
                    if (i == 13) {
                        text = "5,000";
                    }
                    if (i == 14) {
                        text = "7,050";
                    }
                    if (i == 15) {
                        text = "20,000";
                    }
                    if (i == 16) {
                        text = "3,200";
                    }
                    if (i == 17) {
                        text = "300";
                    }
                    if (i == 18) {
                        text = "";
                    }
                    if(i == 19) {
                        text = "5,000";
                    }
                    if(i == 20) {
                        text = "10,000";
                    }
                    if(i == 21) {
                        text = "10,000";
                    }
                    if(i == 22) {
                        text = "10,000";
                    }
                    if(i == 23) {
                        text = "10,000";
                    }
                    if(i == 24) {
                        text = "10,000";
                    }
                    if(i == 25) {
                        text = "10,000";
                    }
                    if(i == 26) {
                        text = "35,000";
                    }
                    if(i == 27) {
                        text = "24,000";
                    }
                    if(i == 28) {
                        text = "18,000";
                    }
                }

                else if (j == 7) {
                    if (i == 0) {
                        text = "제조용";
                    }
                    if (i == 1) {
                        text = "제조용";
                    }
                    if (i == 2) {
                        text = "비상발전기용";
                    }
                    if (i == 3) {
                        text = "기계설비용";
                    }
                    if (i == 4) {
                        text = "기계설비용";
                    }
                    if (i == 5) {
                        text = "제조용";
                    }
                    if (i == 6) {
                        text = "제조용";
                    }
                    if (i == 7) {
                        text = "제조용";
                    }
                    if (i == 8) {
                        text = "제조용";
                    }
                    if (i == 9) {
                        text = "제조용";
                    }
                    if (i == 10) {
                        text = "제조용";
                    }
                    if (i == 11) {
                        text = "제조용";
                    }
                    if (i == 12) {
                        text = "제조용";
                    }
                    if (i == 13) {
                        text = "제조용";
                    }
                    if (i == 14) {
                        text = "제조용";
                    }
                    if (i == 15) {
                        text = "제조용";
                    }
                    if (i == 16) {
                        text = "제조용";
                    }
                    if (i == 17) {
                        text = "제조용";
                    }
                    if (i == 18) {
                        text = "제조용";
                    }
                    if(i == 19) {
                        text = "제조용";
                    }
                    if(i == 20) {
                        text = "제조용";
                    }
                    if(i == 21) {
                        text = "제조용";
                    }
                    if(i == 22) {
                        text = "제조용";
                    }
                    if(i == 23) {
                        text = "제조용";
                    }
                    if(i == 24) {
                        text = "제조용";
                    }
                    if(i == 25) {
                        text = "제조용";
                    }
                    if(i == 26) {
                        text = "제조용";
                    }
                    if(i == 27) {
                        text = "제조용";
                    }
                    if(i == 28) {
                        text = "비상발전기용";
                    }
                }

                else if (j == 8) {
                    if (i == 0) {
                        text = "김충식";
                    }
                    if (i == 1) {
                        text = "김충식";
                    }
                    if (i == 2) {
                        text = "김충식";
                    }
                    if (i == 3) {
                        text = "최종현";
                    }
                    if (i == 4) {
                        text = "최종현";
                    }
                    if (i == 5) {
                        text = "최종현";
                    }
                    if (i == 6) {
                        text = "최종현";
                    }
                    if (i == 7) {
                        text = "김충식";
                    }
                    if (i == 8) {
                        text = "김충식";
                    }
                    if (i == 9) {
                        text = "김충식";
                    }
                    if (i == 10) {
                        text = "김충식";
                    }
                    if (i == 11) {
                        text = "김충식";
                    }
                    if (i == 12) {
                        text = "김충식";
                    }
                    if (i == 13) {
                        text = "김충식";
                    }
                    if (i == 14) {
                        text = "최종현";
                    }
                    if (i == 15) {
                        text = "최종현";
                    }
                    if (i == 16) {
                        text = "최종현";
                    }
                    if (i == 17) {
                        text = "최종현";
                    }
                    if (i == 18) {
                        text = "최종현";
                    }
                    if(i == 19) {
                        text = "김충식";
                    }
                    if(i == 20) {
                        text = "김충식";
                    }
                    if(i == 21) {
                        text = "김충식";
                    }
                    if(i == 22) {
                        text = "김충식";
                    }
                    if(i == 23) {
                        text = "김충식";
                    }
                    if(i == 24) {
                        text = "김충식";
                    }
                    if(i == 25) {
                        text = "김충식";
                    }
                    if(i == 26) {
                        text = "김충식";
                    }
                    if(i == 27) {
                        text = "김충식";
                    }
                    if(i == 28) {
                        text = "김충식";
                    }
                }

                else if (j == 9) {
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
                        text = "기어류 및 오일류" +
                                "바닥면적(39.96m2)";
                    }
                    if (i == 4) {
                        text = "기어류 및 오일류" +
                                "바닥면적(39.96m2)";
                    }
                    if (i == 5) {
                        text = "";
                    }
                    if (i == 6) {
                        text = "";
                    }
                    if (i == 7) {
                        text = "재생에탄올";
                    }
                    if (i == 8) {
                        text = "재생에탄올";
                    }
                    if (i == 9) {
                        text = "수직원통형(Ф1,600 x 1,600 x T8)";
                    }
                    if (i == 10) {
                        text = "수직원통형(Ф2,200 x 2,700 x T6)";
                    }
                    if (i == 11) {
                        text = "수직원통형(Ф2,200 x 2,700 x T6)";
                    }
                    if (i == 12) {
                        text = "수직원통형(Ф2,200 x 2,700 x T6)";
                    }
                    if (i == 13) {
                        text = "수직원통형(Ф1,800 x 2,000 x T5)";
                    }
                    if (i == 14) {
                        text = "";
                    }
                    if (i == 15) {
                        text = "";
                    }
                    if (i == 16) {
                        text = "";
                    }
                    if (i == 17) {
                        text = "";
                    }
                    if (i == 18) {
                        text = "투입 - 폐 에탄올" +
                                "(비위험물)/(800L TK)";
                    }
                    if(i == 19) {
                        text = "종형탱크 (Ф1,800 X 2,126)" +
                                "탱크번호 (ET-101)";
                    }
                    if(i == 20) {
                        text = "종형탱크 (Ф2,200 X 2,852)" +
                                "탱크번호 (ET-102)";
                    }
                    if(i == 21) {
                        text = "종형탱크 (Ф2,200 X 2,852)" +
                                "탱크번호 (ET-103)";
                    }
                    if(i == 22) {
                        text = "종형탱크 (Ф2,200 X 2,852)" +
                                "탱크번호 (ET-104)";
                    }
                    if(i == 23) {
                        text = "종형탱크 (Ф2,200 X 2,852)" +
                                "탱크번호 (ET-105)";
                    }
                    if(i == 24) {
                        text = "종형탱크 (Ф2,200 X 2,852)" +
                                "탱크번호 (ET-106";
                    }
                    if(i == 25) {
                        text = "종형탱크 (Ф2,200 X 2,852)" +
                                "탱크번호 (ET-107)";
                    }
                    if(i == 26) {
                        text = "";
                    }
                    if(i == 27) {
                        text = "";
                    }
                    if(i == 28) {
                        text = "횡형탱크 (Ф2,600 X 3,300)";
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

    @DrawableRes
    public int getDrawable(int value, boolean isGender) {
        if (isGender) {
            return value == BOY ? mBoyDrawable : mGirlDrawable;
        } else {
            return value == SAD ? mSadDrawable : mHappyDrawable;
        }
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
