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
    private static final int ROW_SIZE = 112;


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
                        text = "P1016";
                    }
                    if(i == 1) {
                        text = "P1017";
                    }
                    if(i == 2) {
                        text = "P1017";
                    }
                    if(i == 3) {
                        text = "P1018";
                    }
                    if(i == 4) {
                        text = "P1018";
                    }
                    if(i == 5) {
                        text = "P1018";
                    }
                    if(i == 6) {
                        text = "P1019";
                    }
                    if(i == 7) {
                        text = "P1020";
                    }
                    if(i == 8) {
                        text = "P1020";
                    }
                    if(i == 9) {
                        text = "P1021";
                    }
                    if(i == 10) {
                        text = "P2010";
                    }
                    if(i == 11) {
                        text = "P1113";
                    }
                    if(i == 12) {
                        text = "P1113";
                    }
                    if(i == 13) {
                        text = "P1113";
                    }
                    if(i == 14) {
                        text = "P1114";
                    }
                    if(i == 15) {
                        text = "P1114";
                    }
                    if(i == 16) {
                        text = "P1115";
                    }
                    if(i == 17) {
                        text = "P1115";
                    }
                    if(i == 18) {
                        text = "P1115";
                    }
                    if(i == 19) {
                        text = "P1115";
                    }
                    if(i == 20) {
                        text = "P1116";
                    }
                    if(i == 21) {
                        text = "P1117";
                    }if(i == 22) {
                        text = "P1119";
                    }if(i == 23) {
                        text = "P1119";
                    }if(i == 24) {
                        text = "P1120";
                    }
                    if(i == 25) {
                        text = "P1120";
                    }
                    if(i == 26) {
                        text = "P1121";
                    }if(i == 27) {
                        text = "P1121";
                    }if(i == 28) {
                        text = "P1123";
                    }
                    if(i == 29) {
                        text = "P1123";
                    }
                    if(i == 30) {
                        text = "P1129";
                    }
                    if(i == 31) {
                        text = "P1218";
                    }if(i == 32) {
                        text = "P1218";
                    }
                    if(i == 33) {
                        text = "P1218";
                    }
                    if(i == 34) {
                        text = "P1219";
                    }
                    if(i == 35) {
                        text = "P1219";
                    }
                    if(i == 36) {
                        text = "P1219";
                    }
                    if(i == 37) {
                        text = "P1220";
                    }if(i == 38) {
                        text = "P1220";
                    }
                    if(i == 39) {
                        text = "P1220";
                    }
                    if(i == 40) {
                        text = "P1224";
                    }
                    if(i == 41) {
                        text = "P1224";
                    }if(i == 42) {
                        text = "P1225";
                    }if(i == 43) {
                        text = "P1225";
                    }if(i == 44) {
                        text = "P1226";
                    }if(i == 45) {
                        text = "P1226";
                    }
                    if(i == 46) {
                        text = "P1228";
                    }
                    if(i == 47) {
                        text = "P1228";
                    }if(i == 48) {
                        text = "P1232";
                    }if(i == 49) {
                        text = "P1233";
                    }if(i == 50) {
                        text = "P1233";
                    }if(i == 51) {
                        text = "P1233";
                    }if(i == 52) {
                        text = "P1243";
                    }if(i == 53) {
                        text = "P1244";
                    }if(i == 54) {
                        text = "P1244";
                    }if(i == 55) {
                        text = "P1245";
                    }if(i == 56) {
                        text = "P2018";
                    }if(i == 57) {
                        text = "P2018";
                    }if(i == 58) {
                        text = "P2020";
                    }
                    if(i == 59) {
                        text = "P2022";
                    }
                    if(i == 60) {
                        text = "P2024";
                    }
                    if(i == 61) {
                        text = "P2028";
                    }
                    if(i == 62) {
                        text = "P2028";
                    }
                    if(i == 63) {
                        text = "P2115";
                    }
                    if(i == 64) {
                        text = "P2119";
                    }
                    if(i == 65) {
                        text = "P2119";
                    }
                    if(i == 66) {
                        text = "P2121";
                    }
                    if(i == 67) {
                        text = "P2121";
                    }
                    if(i == 68) {
                        text = "P2125";
                    }
                    if(i == 69) {
                        text = "P2125";
                    }
                    if(i == 70) {
                        text = "P2132";
                    }
                    if(i == 71) {
                        text = "P2132";
                    }
                    if(i == 72) {
                        text = "P2132";
                    }
                    if(i == 73) {
                        text = "B3012";
                    }
                    if(i == 74) {
                        text = "B3012";
                    }
                    if(i == 75) {
                        text = "B3024";
                    }
                    if(i == 76) {
                        text = "B3063";
                    }
                    if(i == 77) {
                        text = "B3069";
                    }
                    if(i == 78) {
                        text = "B3072";
                    }
                    if(i == 79) {
                        text = "B3072";
                    }if(i == 80) {
                        text = "N1008";
                    }
                    if(i == 81) {
                        text = "N1121";
                    }
                    if(i == 82) {
                        text = "N1124";
                    }if(i == 83) {
                        text = "N1144";
                    }
                    if(i == 84) {
                        text = "N1144";
                    }
                    if(i == 85) {
                        text = "N1103";
                    }if(i == 86) {
                        text = "N1103";
                    }
                    if(i == 87) {
                        text = "N1103";
                    }if(i == 88) {
                        text = "N1103";
                    }
                    if(i == 89) {
                        text = "N2112";
                    }if(i == 90) {
                        text = "N2112";
                    }if(i == 91) {
                        text = "N2115";
                    }
                    if(i == 92) {
                        text = "N2117";
                    }
                    if(i == 93) {
                        text = "N2121";
                    }
                    if(i == 94) {
                        text = "N2121";
                    }
                    if(i == 95) {
                        text = "N2122";
                    }
                    if(i == 96) {
                        text = "N2122";
                    }if(i == 97) {
                        text = "N2123";
                    }
                    if(i == 98) {
                        text = "N2123";
                    }
                    if(i == 99) {
                        text = "N2129";
                    }if(i == 100) {
                        text = "N2129";
                    }
                    if(i == 101) {
                        text = "N2223";
                    }
                    if(i == 102) {
                        text = "N2223";
                    }
                    if(i == 103) {
                        text = "N2224";
                    }if(i == 104) {
                        text = "N2224";
                    }if(i == 105) {
                        text = "N2228";
                    }
                    if(i == 106) {
                        text = "N2229";
                    }if(i == 107) {
                        text = "N2229";
                    }
                    if(i == 108) {
                        text = "N2230";
                    }
                    if(i == 109) {
                        text = "N2230";
                    }
                    if(i == 110) {
                        text = "N2246";
                    }
                    if(i == 111) {
                        text = "N2246";
                    }
                }
                else if (j == 1) {
                    if(i == 0) {
                        text = "CIP";
                    }
                    if(i == 1) {
                        text = "냉에탄올 분획실";
                    }
                    if(i == 2) {
                        text = "냉에탄올 분획실";
                    }
                    if(i == 3) {
                        text = "여과실";
                    }
                    if(i == 4) {
                        text = "여과실";
                    }
                    if(i == 5) {
                        text = "여과실";
                    }
                    if(i == 6) {
                        text = "크라이오 원심실";
                    }
                    if(i == 7) {
                        text = "F-9 정제실";
                    }
                    if(i == 8) {
                        text = "F-9 정제실";
                    }
                    if(i == 9) {
                        text = "AT-III 정제실";
                    }
                    if(i == 10) {
                        text = "혈장융해실";
                    }
                    if(i == 11) {
                        text = "GP바이러스 불활화전실";
                    }
                    if(i == 12) {
                        text = "GP바이러스 불활화전실";
                    }
                    if(i == 13) {
                        text = "GP바이러스 불활화전실";
                    }
                    if(i == 14) {
                        text = "GM바이러스 불활화전실";
                    }
                    if(i == 15) {
                        text = "GM바이러스 불활화전실";
                    }
                    if(i == 16) {
                        text = "AT-III 바이러스 불활화전실";
                    }
                    if(i == 17) {
                        text = "AT-III 바이러스 불활화전실";
                    }
                    if(i == 18) {
                        text = "AT-III 바이러스 불활화전실";
                    }
                    if(i == 19) {
                        text = "멸균후실";
                    }
                    if(i == 20) {
                        text = "세척멸균실(불활화전)";
                    }
                    if(i == 21) {
                        text = "ALB바이러스 불활화전실";
                    }if(i == 22) {
                        text = "ALB바이러스 불활화전실";
                    }if(i == 23) {
                        text = "ALB바이러스 불활화전실";
                    }if(i == 24) {
                        text = "IMIG 바이러스 불활화전실";
                    }
                    if(i == 25) {
                        text = "IMIG 바이러스 불활화전실";
                    }
                    if(i == 26) {
                        text = "IVIG-SN바이러스 불활화전실";
                    }if(i == 27) {
                        text = "IVIG-SN바이러스 불활화전실";
                    }if(i == 28) {
                        text = "버퍼조제실";
                    }
                    if(i == 29) {
                        text = "버퍼조제실";
                    }
                    if(i == 30) {
                        text = "CIP실";
                    }
                    if(i == 31) {
                        text = "GP바이러스 불활화후실";
                    }if(i == 32) {
                        text = "GP바이러스 불활화후실";
                    }
                    if(i == 33) {
                        text = "GP바이러스 불활화후실";
                    }
                    if(i == 34) {
                        text = "GM바이러스 불활화후실";
                    }
                    if(i == 35) {
                        text = "GM바이러스 불활화후실";
                    }
                    if(i == 36) {
                        text = "GM바이러스 불활화후실";
                    }
                    if(i == 37) {
                        text = "AT-III바이러스 불활화후실";
                    }if(i == 38) {
                        text = "AT-III바이러스 불활화후실";
                    }
                    if(i == 39) {
                        text = "AT-III바이러스 불활화후실";
                    }
                    if(i == 40) {
                        text = "ALB열처리후실";
                    }
                    if(i == 41) {
                        text = "ALB열처리후실";
                    }if(i == 42) {
                        text = "VIG-SN바이러스 불활화후실";
                    }if(i == 43) {
                        text = "VIG-SN바이러스 불활화후실";
                    }if(i == 44) {
                        text = "IVIG-SN투석/농축실";
                    }if(i == 45) {
                        text = "IVIG-SN투석/농축실";
                    }
                    if(i == 46) {
                        text = "NANO 여과실";
                    }
                    if(i == 47) {
                        text = "NANO 여과실";
                    }if(i == 48) {
                        text = "최종원액실 A";
                    }if(i == 49) {
                        text = "MIG바이러스 불활화후실";
                    }if(i == 50) {
                        text = "MIG바이러스 불활화후실";
                    }if(i == 51) {
                        text = "MIG바이러스 불활화후실";
                    }if(i == 52) {
                        text = "기기보관실";
                    }if(i == 53) {
                        text = "버퍼조제실";
                    }if(i == 54) {
                        text = "버퍼조제실";
                    }if(i == 55) {
                        text = "CIP실";
                    }if(i == 56) {
                        text = "준비실 및 작업실";
                    }if(i == 57) {
                        text = "준비실 및 작업실";
                    }if(i == 58) {
                        text = "세척실II";
                    }
                    if(i == 59) {
                        text = "배양실";
                    }
                    if(i == 60) {
                        text = "조제실";
                    }
                    if(i == 61) {
                        text = "세척실I";
                    }
                    if(i == 62) {
                        text = "세척실I";
                    }
                    if(i == 63) {
                        text = "세척멸균실";
                    }
                    if(i == 64) {
                        text = "발효 및 배양액처리실";
                    }
                    if(i == 65) {
                        text = "발효 및 배양액처리실";
                    }
                    if(i == 66) {
                        text = "세척멸균실2";
                    }
                    if(i == 67) {
                        text = "세척멸균실2";
                    }
                    if(i == 68) {
                        text = "버퍼조제실";
                    }
                    if(i == 69) {
                        text = "버퍼조제실";
                    }
                    if(i == 70) {
                        text = "버퍼조제실";
                    }
                    if(i == 71) {
                        text = "버퍼조제실";
                    }
                    if(i == 72) {
                        text = "버퍼조제실";
                    }
                    if(i == 73) {
                        text = "공정검사실";
                    }
                    if(i == 74) {
                        text = "공정검사실";
                    }
                    if(i == 75) {
                        text = "세척실";
                    }
                    if(i == 76) {
                        text = "복도";
                    }
                    if(i == 77) {
                        text = "작업진행실-1";
                    }
                    if(i == 78) {
                        text = "배지,버퍼조제실";
                    }
                    if(i == 79) {
                        text = "배지,버퍼조제실";
                    }if(i == 80) {
                        text = "CIP";
                    }
                    if(i == 81) {
                        text = "풀링실";
                    }
                    if(i == 82) {
                        text = "세척실";
                    }if(i == 83) {
                        text = "세척실";
                    }
                    if(i == 84) {
                        text = "세척실";
                    }
                    if(i == 85) {
                        text = "PD보관실";
                    }if(i == 86) {
                        text = "PD보관실";
                    }
                    if(i == 87) {
                        text = "PD보관실";
                    }if(i == 88) {
                        text = "PD보관실";
                    }
                    if(i == 89) {
                        text = "ALB열처리전실";
                    }if(i == 90) {
                        text = "ALB열처리전실";
                    }if(i == 91) {
                        text = "F-VIII 불활화전실";
                    }
                    if(i == 92) {
                        text = "버퍼조제실";
                    }
                    if(i == 93) {
                        text = "IVIG Fr.III 용해실";
                    }
                    if(i == 94) {
                        text = "IVIG Fr.III 용해실";
                    }
                    if(i == 95) {
                        text = "IVIG 1차 컬럼 정제실";
                    }
                    if(i == 96) {
                        text = "IVIG 1차 컬럼 정제실";
                    }if(i == 97) {
                        text = "IVIG S/D 처리실";
                    }
                    if(i == 98) {
                        text = "IVIG S/D 처리실";
                    }
                    if(i == 99) {
                        text = "세척실";
                    }if(i == 100) {
                        text = "세척실";
                    }
                    if(i == 101) {
                        text = "F-VIII 불활화후실";
                    }
                    if(i == 102) {
                        text = "F-VIII 불활화후실";
                    }
                    if(i == 103) {
                        text = "버퍼조제실";
                    }if(i == 104) {
                        text = "버퍼조제실";
                    }if(i == 105) {
                        text = "IVIG 2차컬럼 작업실";
                    }
                    if(i == 106) {
                        text = "IVIG 투석/농축실";
                    }if(i == 107) {
                        text = "IVIG 투석/농축실";
                    }
                    if(i == 108) {
                        text = "IVIG 극미세여과실";
                    }
                    if(i == 109) {
                        text = "IVIG 극미세여과실";
                    }
                    if(i == 110) {
                        text = "세척실";
                    }
                    if(i == 111) {
                        text = "세척실";
                    }
                }
                else if (j == 2) {
                    if(i == 0) {
                        text = "수산화나트륨";
                    }
                    if(i == 1) {
                        text = "수산화나트륨";
                    }
                    if(i == 2) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 3) {
                        text = "수산화나트륨";
                    }
                    if(i == 4) {
                        text = "수산화나트륨";
                    }
                    if(i == 5) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 6) {
                        text = "수산화나트륨";
                    }
                    if(i == 7) {
                        text = "수산화나트륨";
                    }
                    if(i == 8) {
                        text = "염화수소";
                    }
                    if(i == 9) {
                        text = "수산화나트륨";
                    }
                    if(i == 10) {
                        text = "수산화나트륨";
                    }
                    if(i == 11) {
                        text = "수산화나트륨";
                    }
                    if(i == 12) {
                        text = "수산화나트륨";
                    }
                    if(i == 13) {
                        text = "염화수소";
                    }
                    if(i == 14) {
                        text = "수산화나트륨";
                    }
                    if(i == 15) {
                        text = "수산화나트륨";
                    }
                    if(i == 16) {
                        text = "수산화나트륨";
                    }
                    if(i == 17) {
                        text = "수산화나트륨";
                    }
                    if(i == 18) {
                        text = "염화수소";
                    }
                    if(i == 19) {
                        text = "수산화나트륨";
                    }
                    if(i == 20) {
                        text = "수산화나트륨";
                    }
                    if(i == 21) {
                        text = "수산화나트륨";
                    }if(i == 22) {
                        text = "수산화나트륨";
                    }if(i == 23) {
                        text = "트리클로로아세트산";
                    }if(i == 24) {
                        text = "수산화나트륨";
                    }
                    if(i == 25) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 26) {
                        text = "수산화나트륨";
                    }if(i == 27) {
                        text = "트리클로로아세트산";
                    }if(i == 28) {
                        text = "수산화나트륨";
                    }
                    if(i == 29) {
                        text = "염화수소";
                    }
                    if(i == 30) {
                        text = "수산화나트륨";
                    }
                    if(i == 31) {
                        text = "수산화나트륨";
                    }if(i == 32) {
                        text = "수산화나트륨";
                    }
                    if(i == 33) {
                        text = "염화수소";
                    }
                    if(i == 34) {
                        text = "수산화나트륨";
                    }
                    if(i == 35) {
                        text = "수산화나트륨";
                    }
                    if(i == 36) {
                        text = "염화수소";
                    }
                    if(i == 37) {
                        text = "수산화나트륨";
                    }if(i == 38) {
                        text = "수산화나트륨";
                    }
                    if(i == 39) {
                        text = "염화수소";
                    }
                    if(i == 40) {
                        text = "수산화나트륨";
                    }
                    if(i == 41) {
                        text = "수산화나트륨";
                    }if(i == 42) {
                        text = "수산화나트륨";
                    }if(i == 43) {
                        text = "수산화나트륨";
                    }if(i == 44) {
                        text = "수산화나트륨";
                    }if(i == 45) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 46) {
                        text = "수산화나트륨";
                    }
                    if(i == 47) {
                        text = "염화수소";
                    }if(i == 48) {
                        text = "치메로살";
                    }if(i == 49) {
                        text = "수산화나트륨";
                    }if(i == 50) {
                        text = "염화수소";
                    }if(i == 51) {
                        text = "트리클로로아세트산";
                    }if(i == 52) {
                        text = "수산화나트륨";
                    }if(i == 53) {
                        text = "수산화나트륨";
                    }if(i == 54) {
                        text = "수산화나트륨";
                    }if(i == 55) {
                        text = "수산화나트륨";
                    }if(i == 56) {
                        text = "수산화나트륨";
                    }if(i == 57) {
                        text = "염화수소";
                    }if(i == 58) {
                        text = "수산화나트륨";
                    }
                    if(i == 59) {
                        text = "수산화나트륨";
                    }
                    if(i == 60) {
                        text = "수산화나트륨";
                    }
                    if(i == 61) {
                        text = "수산화나트륨";
                    }
                    if(i == 62) {
                        text = "염화수소";
                    }
                    if(i == 63) {
                        text = "수산화나트륨";
                    }
                    if(i == 64) {
                        text = "수산화나트륨";
                    }
                    if(i == 65) {
                        text = "암모니아수";
                    }
                    if(i == 66) {
                        text = "수산화나트륨";
                    }
                    if(i == 67) {
                        text = "염화수소";
                    }
                    if(i == 68) {
                        text = "수산화나트륨";
                    }
                    if(i == 69) {
                        text = "염화수소";
                    }
                    if(i == 70) {
                        text = "수산화나트륨";
                    }
                    if(i == 71) {
                        text = "염화수소";
                    }
                    if(i == 72) {
                        text = "황산니켈 수화물";
                    }
                    if(i == 73) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 74) {
                        text = "메탄올";
                    }
                    if(i == 75) {
                        text = "수산화나트륨";
                    }
                    if(i == 76) {
                        text = "수산화나트륨";
                    }
                    if(i == 77) {
                        text = "수산화나트륨";
                    }
                    if(i == 78) {
                        text = "수산화나트륨";
                    }
                    if(i == 79) {
                        text = "염화수소";
                    }if(i == 80) {
                        text = "수산화나트륨";
                    }
                    if(i == 81) {
                        text = "수산화나트륨";
                    }
                    if(i == 82) {
                        text = "수산화나트륨";
                    }if(i == 83) {
                        text = "수산화나트륨";
                    }
                    if(i == 84) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 85) {
                        text = "수산화나트륨";
                    }if(i == 86) {
                        text = "수산화나트륨";
                    }
                    if(i == 87) {
                        text = "염화수소";
                    }if(i == 88) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 89) {
                        text = "수산화나트륨";
                    }if(i == 90) {
                        text = "트리클로로아세트산";
                    }if(i == 91) {
                        text = "수산화나트륨";
                    }
                    if(i == 92) {
                        text = "수산화나트륨";
                    }
                    if(i == 93) {
                        text = "수산화나트륨";
                    }
                    if(i == 94) {
                        text = "수산화나트륨";
                    }
                    if(i == 95) {
                        text = "수산화나트륨";
                    }
                    if(i == 96) {
                        text = "트리클로로아세트산";
                    }if(i == 97) {
                        text = "수산화나트륨";
                    }
                    if(i == 98) {
                        text = "수산화나트륨";
                    }
                    if(i == 99) {
                        text = "수산화나트륨";
                    }if(i == 100) {
                        text = "수산화나트륨";
                    }
                    if(i == 101) {
                        text = "수산화나트륨";
                    }
                    if(i == 102) {
                        text = "염화수소";
                    }
                    if(i == 103) {
                        text = "수산화나트륨";
                    }if(i == 104) {
                        text = "수산화나트륨";
                    }if(i == 105) {
                        text = "수산화나트륨";
                    }
                    if(i == 106) {
                        text = "수산화나트륨";
                    }if(i == 107) {
                        text = "트리클로로아세트산";
                    }
                    if(i == 108) {
                        text = "수산화나트륨";
                    }
                    if(i == 109) {
                        text = "염화수소";
                    }
                    if(i == 110) {
                        text = "수산화나트륨";
                    }
                    if(i == 111) {
                        text = "수산화나트륨";
                    }
                }
                else if (j == 3) {
                    if(i == 0) {
                        text = "액상";
                    }
                    if(i == 1) {
                        text = "고상";
                    }
                    if(i == 2) {
                        text = "고상";
                    }
                    if(i == 3) {
                        text = "액상";
                    }
                    if(i == 4) {
                        text = "고상";
                    }
                    if(i == 5) {
                        text = "고상";
                    }
                    if(i == 6) {
                        text = "고상";
                    }
                    if(i == 7) {
                        text = "고상";
                    }
                    if(i == 8) {
                        text = "액상";
                    }
                    if(i == 9) {
                        text = "고상";
                    }
                    if(i == 10) {
                        text = "고상";
                    }
                    if(i == 11) {
                        text = "액상";
                    }
                    if(i == 12) {
                        text = "고상";
                    }
                    if(i == 13) {
                        text = "액상";
                    }
                    if(i == 14) {
                        text = "액상";
                    }
                    if(i == 15) {
                        text = "고상";
                    }
                    if(i == 16) {
                        text = "액상";
                    }
                    if(i == 17) {
                        text = "고상";
                    }
                    if(i == 18) {
                        text = "액상";
                    }
                    if(i == 19) {
                        text = "액상";
                    }
                    if(i == 20) {
                        text = "액상";
                    }
                    if(i == 21) {
                        text = "액상";
                    }if(i == 22) {
                        text = "고상";
                    }if(i == 23) {
                        text = "고상";
                    }if(i == 24) {
                        text = "고상";
                    }
                    if(i == 25) {
                        text = "고상";
                    }
                    if(i == 26) {
                        text = "고상";
                    }if(i == 27) {
                        text = "고상";
                    }if(i == 28) {
                        text = "고상";
                    }
                    if(i == 29) {
                        text = "액상";
                    }
                    if(i == 30) {
                        text = "액상";
                    }
                    if(i == 31) {
                        text = "액상";
                    }if(i == 32) {
                        text = "고상";
                    }
                    if(i == 33) {
                        text = "액상";
                    }
                    if(i == 34) {
                        text = "액상";
                    }
                    if(i == 35) {
                        text = "고상";
                    }
                    if(i == 36) {
                        text = "액상";
                    }
                    if(i == 37) {
                        text = "액상";
                    }if(i == 38) {
                        text = "고상";
                    }
                    if(i == 39) {
                        text = "액상";
                    }
                    if(i == 40) {
                        text = "액상";
                    }
                    if(i == 41) {
                        text = "고상";
                    }if(i == 42) {
                        text = "액상";
                    }if(i == 43) {
                        text = "고상";
                    }if(i == 44) {
                        text = "고상";
                    }if(i == 45) {
                        text = "고상";
                    }
                    if(i == 46) {
                        text = "액상";
                    }
                    if(i == 47) {
                        text = "액상";
                    }if(i == 48) {
                        text = "고상";
                    }if(i == 49) {
                        text = "고상";
                    }if(i == 50) {
                        text = "액상";
                    }if(i == 51) {
                        text = "고상";
                    }if(i == 52) {
                        text = "액상";
                    }if(i == 53) {
                        text = "액상";
                    }if(i == 54) {
                        text = "고상";
                    }if(i == 55) {
                        text = "액상";
                    }if(i == 56) {
                        text = "고상";
                    }if(i == 57) {
                        text = "액상";
                    }if(i == 58) {
                        text = "액상";
                    }
                    if(i == 59) {
                        text = "액상";
                    }
                    if(i == 60) {
                        text = "액상";
                    }
                    if(i == 61) {
                        text = "고상";
                    }
                    if(i == 62) {
                        text = "액상";
                    }
                    if(i == 63) {
                        text = "액상";
                    }
                    if(i == 64) {
                        text = "액상";
                    }
                    if(i == 65) {
                        text = "액상";
                    }
                    if(i == 66) {
                        text = "액상";
                    }
                    if(i == 67) {
                        text = "액상";
                    }
                    if(i == 68) {
                        text = "고상";
                    }
                    if(i == 69) {
                        text = "액상";
                    }
                    if(i == 70) {
                        text = "액상";
                    }
                    if(i == 71) {
                        text = "액상";
                    }
                    if(i == 72) {
                        text = "액상";
                    }
                    if(i == 73) {
                        text = "고상";
                    }
                    if(i == 74) {
                        text = "액상";
                    }
                    if(i == 75) {
                        text = "액상";
                    }
                    if(i == 76) {
                        text = "액상";
                    }
                    if(i == 77) {
                        text = "액상";
                    }
                    if(i == 78) {
                        text = "고상";
                    }
                    if(i == 79) {
                        text = "액상";
                    }if(i == 80) {
                        text = "액상";
                    }
                    if(i == 81) {
                        text = "고상";
                    }
                    if(i == 82) {
                        text = "고상";
                    }if(i == 83) {
                        text = "액상";
                    }
                    if(i == 84) {
                        text = "고상";
                    }
                    if(i == 85) {
                        text = "액상";
                    }if(i == 86) {
                        text = "고상";
                    }
                    if(i == 87) {
                        text = "액상";
                    }if(i == 88) {
                        text = "고상";
                    }
                    if(i == 89) {
                        text = "고상";
                    }if(i == 90) {
                        text = "고상";
                    }if(i == 91) {
                        text = "고상";
                    }
                    if(i == 92) {
                        text = "고상";
                    }
                    if(i == 93) {
                        text = "액상";
                    }
                    if(i == 94) {
                        text = "고상";
                    }
                    if(i == 95) {
                        text = "고상";
                    }
                    if(i == 96) {
                        text = "고상";
                    }if(i == 97) {
                        text = "액상";
                    }
                    if(i == 98) {
                        text = "고상";
                    }
                    if(i == 99) {
                        text = "액상";
                    }if(i == 100) {
                        text = "고상";
                    }
                    if(i == 101) {
                        text = "고상";
                    }
                    if(i == 102) {
                        text = "액상";
                    }
                    if(i == 103) {
                        text = "액상";
                    }if(i == 104) {
                        text = "고상";
                    }if(i == 105) {
                        text = "액상";
                    }
                    if(i == 106) {
                        text = "고상";
                    }if(i == 107) {
                        text = "고상";
                    }
                    if(i == 108) {
                        text = "고상";
                    }
                    if(i == 109) {
                        text = "액상";
                    }
                    if(i == 110) {
                        text = "액상";
                    }
                    if(i == 111) {
                        text = "고상";
                    }
                }
                else if (j == 4) {
                    if(i == 0) {
                        text = "50 ~ 55%";
                    }
                    if(i == 1) {
                        text = "95 ~ 100%";
                    }
                    if(i == 2) {
                        text = "100%";
                    }
                    if(i == 3) {
                        text = "50 ~ 55%";
                    }
                    if(i == 4) {
                        text = "95 ~ 100%";
                    }
                    if(i == 5) {
                        text = "100%";
                    }
                    if(i == 6) {
                        text = "95 ~ 100%";
                    }
                    if(i == 7) {
                        text = "95 ~ 100%";
                    }
                    if(i == 8) {
                        text = "20 ~ 40%";
                    }
                    if(i == 9) {
                        text = "95 ~ 100%";
                    }
                    if(i == 10) {
                        text = "95 ~ 100%";
                    }
                    if(i == 11) {
                        text = "50 ~ 55%";
                    }
                    if(i == 12) {
                        text = "95 ~ 100%";
                    }
                    if(i == 13) {
                        text = "20 ~ 40%";
                    }
                    if(i == 14) {
                        text = "50 ~ 55%";
                    }
                    if(i == 15) {
                        text = "95 ~ 100%";
                    }
                    if(i == 16) {
                        text = "50 ~ 55%";
                    }
                    if(i == 17) {
                        text = "95 ~ 100%";
                    }
                    if(i == 18) {
                        text = "20 ~ 40%";
                    }
                    if(i == 19) {
                        text = "50 ~ 55%";
                    }
                    if(i == 20) {
                        text = "50 ~ 55%";
                    }
                    if(i == 21) {
                        text = "50 ~ 55%";
                    }if(i == 22) {
                        text = "95 ~ 100%";
                    }if(i == 23) {
                        text = "100%";
                    }if(i == 24) {
                        text = "95 ~ 100%";
                    }
                    if(i == 25) {
                        text = "100";
                    }
                    if(i == 26) {
                        text = "95 ~ 100%";
                    }if(i == 27) {
                        text = "100%";
                    }if(i == 28) {
                        text = "95 ~ 100%";
                    }
                    if(i == 29) {
                        text = "20 ~ 40%";
                    }
                    if(i == 30) {
                        text = "50 ~ 55%";
                    }
                    if(i == 31) {
                        text = "50 ~ 55%";
                    }if(i == 32) {
                        text = "95 ~ 100%";
                    }
                    if(i == 33) {
                        text = "20 ~ 40%";
                    }
                    if(i == 34) {
                        text = "50 ~ 55%";
                    }
                    if(i == 35) {
                        text = "95 ~ 100%";
                    }
                    if(i == 36) {
                        text = "20 ~ 40%";
                    }
                    if(i == 37) {
                        text = "50 ~ 55%";
                    }if(i == 38) {
                        text = "95 ~ 100%";
                    }
                    if(i == 39) {
                        text = "20 ~ 40%";
                    }
                    if(i == 40) {
                        text = "50 ~ 55%";
                    }
                    if(i == 41) {
                        text = "95 ~ 100%";
                    }if(i == 42) {
                        text = "50 ~ 55%";
                    }if(i == 43) {
                        text = "95 ~ 100%";
                    }if(i == 44) {
                        text = "95 ~ 100%";
                    }if(i == 45) {
                        text = "100%";
                    }
                    if(i == 46) {
                        text = "50 ~ 55%";
                    }
                    if(i == 47) {
                        text = "20 ~ 40%";
                    }if(i == 48) {
                        text = "100%";
                    }if(i == 49) {
                        text = "95 ~ 100%";
                    }if(i == 50) {
                        text = "20 ~ 40%";
                    }if(i == 51) {
                        text = "100%";
                    }if(i == 52) {
                        text = "50 ~ 55%";
                    }if(i == 53) {
                        text = "50 ~ 55%";
                    }if(i == 54) {
                        text = "95 ~ 100%";
                    }if(i == 55) {
                        text = "50 ~ 55%";
                    }if(i == 56) {
                        text = "95 ~ 100%";
                    }if(i == 57) {
                        text = "20 ~ 40%";
                    }if(i == 58) {
                        text = "50 ~ 55%";
                    }
                    if(i == 59) {
                        text = "50 ~ 55%";
                    }
                    if(i == 60) {
                        text = "50 ~ 55%";
                    }
                    if(i == 61) {
                        text = "95 ~ 100%";
                    }
                    if(i == 62) {
                        text = "20 ~ 40%";
                    }
                    if(i == 63) {
                        text = "50 ~ 55%";
                    }
                    if(i == 64) {
                        text = "50 ~ 55%";
                    }
                    if(i == 65) {
                        text = "25%";
                    }
                    if(i == 66) {
                        text = "50 ~ 55%";
                    }
                    if(i == 67) {
                        text = "20 ~ 40%";
                    }
                    if(i == 68) {
                        text = "95 ~ 100%";
                    }
                    if(i == 69) {
                        text = "20 ~ 40%";
                    }
                    if(i == 70) {
                        text = "50 ~ 55%";
                    }
                    if(i == 71) {
                        text = "20 ~ 40%";
                    }
                    if(i == 72) {
                        text = "100%";
                    }
                    if(i == 73) {
                        text = "100%";
                    }
                    if(i == 74) {
                        text = "100%";
                    }
                    if(i == 75) {
                        text = "50 ~ 55%";
                    }
                    if(i == 76) {
                        text = "50 ~ 55%";
                    }
                    if(i == 77) {
                        text = "50 ~ 55%";
                    }
                    if(i == 78) {
                        text = "95 ~ 100%";
                    }
                    if(i == 79) {
                        text = "20 ~ 40%";
                    }if(i == 80) {
                        text = "50 ~ 55%";
                    }
                    if(i == 81) {
                        text = "95 ~ 100%";
                    }
                    if(i == 82) {
                        text = "95 ~ 100%";
                    }if(i == 83) {
                        text = "50 ~ 55%";
                    }
                    if(i == 84) {
                        text = "100%";
                    }
                    if(i == 85) {
                        text = "50 ~ 55%";
                    }if(i == 86) {
                        text = "95 ~ 100%";
                    }
                    if(i == 87) {
                        text = "20 ~ 40%";
                    }if(i == 88) {
                        text = "100%";
                    }
                    if(i == 89) {
                        text = "95 ~ 100%";
                    }if(i == 90) {
                        text = "100%";
                    }if(i == 91) {
                        text = "95 ~ 100%";
                    }
                    if(i == 92) {
                        text = "95 ~ 100%";
                    }
                    if(i == 93) {
                        text = "50 ~ 55%";
                    }
                    if(i == 94) {
                        text = "95 ~ 100%";
                    }
                    if(i == 95) {
                        text = "95 ~ 100%";
                    }
                    if(i == 96) {
                        text = "100%";
                    }if(i == 97) {
                        text = "50 ~ 55%";
                    }
                    if(i == 98) {
                        text = "95 ~ 100%";
                    }
                    if(i == 99) {
                        text = "50 ~ 55%";
                    }if(i == 100) {
                        text = "95 ~ 100%";
                    }
                    if(i == 101) {
                        text = "95 ~ 100%";
                    }
                    if(i == 102) {
                        text = "20 ~ 40%";
                    }
                    if(i == 103) {
                        text = "50 ~ 55%";
                    }if(i == 104) {
                        text = "95 ~ 100%";
                    }if(i == 105) {
                        text = "50 ~ 55%";
                    }
                    if(i == 106) {
                        text = "95 ~ 100%";
                    }if(i == 107) {
                        text = "100%";
                    }
                    if(i == 108) {
                        text = "95 ~ 100%";
                    }
                    if(i == 109) {
                        text = "20 ~ 40%";
                    }
                    if(i == 110) {
                        text = "50 ~ 55%";
                    }
                    if(i == 111) {
                        text = "95 ~ 100%";
                    }
                }
                else if (j == 5) {
                    if(i == 0) {
                        text = "1310-73-2";
                    }
                    if(i == 1) {
                        text = "1310-73-2";
                    }
                    if(i == 2) {
                        text = "76-03-9";
                    }
                    if(i == 3) {
                        text = "1310-73-2";
                    }
                    if(i == 4) {
                        text = "1310-73-2";
                    }
                    if(i == 5) {
                        text = "76-03-9";
                    }
                    if(i == 6) {
                        text = "1310-73-2";
                    }
                    if(i == 7) {
                        text = "1310-73-2";
                    }
                    if(i == 8) {
                        text = "7647-01-0";
                    }
                    if(i == 9) {
                        text = "1310-73-2";
                    }
                    if(i == 10) {
                        text = "1310-73-2";
                    }
                    if(i == 11) {
                        text = "1310-73-2";
                    }
                    if(i == 12) {
                        text = "1310-73-2";
                    }
                    if(i == 13) {
                        text = "7647-01-0";
                    }
                    if(i == 14) {
                        text = "1310-73-2";
                    }
                    if(i == 15) {
                        text = "1310-73-2";
                    }
                    if(i == 16) {
                        text = "1310-73-2";
                    }
                    if(i == 17) {
                        text = "1310-73-2";
                    }
                    if(i == 18) {
                        text = "7647-01-0";
                    }
                    if(i == 19) {
                        text = "1310-73-2";
                    }
                    if(i == 20) {
                        text = "1310-73-2";
                    }
                    if(i == 21) {
                        text = "1310-73-2";
                    }if(i == 22) {
                        text = "1310-73-2";
                    }if(i == 23) {
                        text = "76-03-9";
                    }if(i == 24) {
                        text = "1310-73-2";
                    }
                    if(i == 25) {
                        text = "76-03-9";
                    }
                    if(i == 26) {
                        text = "1310-73-2";
                    }if(i == 27) {
                        text = "76-03-9";
                    }if(i == 28) {
                        text = "1310-73-2";
                    }
                    if(i == 29) {
                        text = "7647-01-0";
                    }
                    if(i == 30) {
                        text = "1310-73-2";
                    }
                    if(i == 31) {
                        text = "1310-73-2";
                    }if(i == 32) {
                        text = "1310-73-2";
                    }
                    if(i == 33) {
                        text = "7647-01-0";
                    }
                    if(i == 34) {
                        text = "1310-73-2";
                    }
                    if(i == 35) {
                        text = "1310-73-2";
                    }
                    if(i == 36) {
                        text = "7647-01-0";
                    }
                    if(i == 37) {
                        text = "1310-73-2";
                    }if(i == 38) {
                        text = "1310-73-2";
                    }
                    if(i == 39) {
                        text = "7647-01-0";
                    }
                    if(i == 40) {
                        text = "1310-73-2";
                    }
                    if(i == 41) {
                        text = "1310-73-2";
                    }if(i == 42) {
                        text = "1310-73-2";
                    }if(i == 43) {
                        text = "1310-73-2";
                    }if(i == 44) {
                        text = "1310-73-2";
                    }if(i == 45) {
                        text = "76-03-9";
                    }
                    if(i == 46) {
                        text = "1310-73-2";
                    }
                    if(i == 47) {
                        text = "7647-01-0";
                    }if(i == 48) {
                        text = "54-64-8";
                    }if(i == 49) {
                        text = "1310-73-2";
                    }if(i == 50) {
                        text = "7647-01-0";
                    }if(i == 51) {
                        text = "76-03-9";
                    }if(i == 52) {
                        text = "1310-73-2";
                    }if(i == 53) {
                        text = "1310-73-2";
                    }if(i == 54) {
                        text = "1310-73-2";
                    }if(i == 55) {
                        text = "1310-73-2";
                    }if(i == 56) {
                        text = "1310-73-2";
                    }if(i == 57) {
                        text = "7647-01-0";
                    }if(i == 58) {
                        text = "1310-73-2";
                    }
                    if(i == 59) {
                        text = "1310-73-2";
                    }
                    if(i == 60) {
                        text = "1310-73-2";
                    }
                    if(i == 61) {
                        text = "1310-73-2";
                    }
                    if(i == 62) {
                        text = "7647-01-0";
                    }
                    if(i == 63) {
                        text = "1310-73-2";
                    }
                    if(i == 64) {
                        text = "1310-73-2";
                    }
                    if(i == 65) {
                        text = "1336-21-6";
                    }
                    if(i == 66) {
                        text = "1310-73-2";
                    }
                    if(i == 67) {
                        text = "7647-01-0";
                    }
                    if(i == 68) {
                        text = "1310-73-2";
                    }
                    if(i == 69) {
                        text = "7647-01-0";
                    }
                    if(i == 70) {
                        text = "1310-73-2";
                    }
                    if(i == 71) {
                        text = "7647-01-0";
                    }
                    if(i == 72) {
                        text = "10101-97-0";
                    }
                    if(i == 73) {
                        text = "76-03-9";
                    }
                    if(i == 74) {
                        text = "67-56-1";
                    }
                    if(i == 75) {
                        text = "1310-73-2";
                    }
                    if(i == 76) {
                        text = "1310-73-2";
                    }
                    if(i == 77) {
                        text = "1310-73-2";
                    }
                    if(i == 78) {
                        text = "1310-73-2";
                    }
                    if(i == 79) {
                        text = "7647-01-0";
                    }if(i == 80) {
                        text = "1310-73-2";
                    }
                    if(i == 81) {
                        text = "1310-73-2";
                    }
                    if(i == 82) {
                        text = "1310-73-2";
                    }if(i == 83) {
                        text = "1310-73-2";
                    }
                    if(i == 84) {
                        text = "76-03-9";
                    }
                    if(i == 85) {
                        text = "1310-73-2";
                    }if(i == 86) {
                        text = "1310-73-2";
                    }
                    if(i == 87) {
                        text = "7647-01-0";
                    }if(i == 88) {
                        text = "76-03-9";
                    }
                    if(i == 89) {
                        text = "1310-73-2";
                    }if(i == 90) {
                        text = "76-03-9";
                    }if(i == 91) {
                        text = "1310-73-2";
                    }
                    if(i == 92) {
                        text = "1310-73-2";
                    }
                    if(i == 93) {
                        text = "1310-73-2";
                    }
                    if(i == 94) {
                        text = "1310-73-2";
                    }
                    if(i == 95) {
                        text = "1310-73-2";
                    }
                    if(i == 96) {
                        text = "76-03-9";
                    }if(i == 97) {
                        text = "1310-73-2";
                    }
                    if(i == 98) {
                        text = "1310-73-2";
                    }
                    if(i == 99) {
                        text = "1310-73-2";
                    }if(i == 100) {
                        text = "1310-73-2";
                    }
                    if(i == 101) {
                        text = "1310-73-2";
                    }
                    if(i == 102) {
                        text = "7647-01-0";
                    }
                    if(i == 103) {
                        text = "1310-73-2";
                    }if(i == 104) {
                        text = "1310-73-2";
                    }if(i == 105) {
                        text = "1310-73-2";
                    }
                    if(i == 106) {
                        text = "1310-73-2";
                    }if(i == 107) {
                        text = "76-03-9";
                    }
                    if(i == 108) {
                        text = "1310-73-2";
                    }
                    if(i == 109) {
                        text = "7647-01-0";
                    }
                    if(i == 110) {
                        text = "1310-73-2";
                    }
                    if(i == 111) {
                        text = "1310-73-2";
                    }
                }
                else if (j == 6) {
                    if(i == 0) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 1) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 2) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 3) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 4) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 5) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 6) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 7) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 8) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 9) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 10) {
                        text = "분획팀 분획1,2파트";
                    }
                    if(i == 11) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 12) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 13) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 14) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 15) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 16) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 17) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 18) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 19) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 20) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 21) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 22) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 23) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 24) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 25) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 26) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 27) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 28) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 29) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 30) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 31) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 32) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 33) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 34) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 35) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 36) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 37) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 38) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 39) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 40) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 41) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 42) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 43) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 44) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 45) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 46) {
                        text = "정제팀 정제1,2파트";
                    }
                    if(i == 47) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 48) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 49) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 50) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 51) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 52) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 53) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 54) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 55) {
                        text = "정제팀 정제1,2파트";
                    }if(i == 56) {
                        text = "유전자팀";
                    }if(i == 57) {
                        text = "유전자팀";
                    }if(i == 58) {
                        text = "유전자팀";
                    }
                    if(i == 59) {
                        text = "유전자팀";
                    }
                    if(i == 60) {
                        text = "유전자팀";
                    }
                    if(i == 61) {
                        text = "유전자팀";
                    }
                    if(i == 62) {
                        text = "유전자팀";
                    }
                    if(i == 63) {
                        text = "유전자팀";
                    }
                    if(i == 64) {
                        text = "유전자팀";
                    }
                    if(i == 65) {
                        text = "유전자팀";
                    }
                    if(i == 66) {
                        text = "유전자팀";
                    }
                    if(i == 67) {
                        text = "유전자팀";
                    }
                    if(i == 68) {
                        text = "유전자팀";
                    }
                    if(i == 69) {
                        text = "유전자팀";
                    }
                    if(i == 70) {
                        text = "유전자팀";
                    }
                    if(i == 71) {
                        text = "유전자팀";
                    }
                    if(i == 72) {
                        text = "유전자팀";
                    }
                    if(i == 73) {
                        text = "유전자팀";
                    }
                    if(i == 74) {
                        text = "유전자팀";
                    }
                    if(i == 75) {
                        text = "유전자팀";
                    }
                    if(i == 76) {
                        text = "유전자팀";
                    }
                    if(i == 77) {
                        text = "유전자팀";
                    }
                    if(i == 78) {
                        text = "유전자팀";
                    }
                    if(i == 79) {
                        text = "유전자팀";
                    }if(i == 80) {
                        text = "분획팀 분획3파트,\n" +
                                "정제팀 정제3파트";
                    }
                    if(i == 81) {
                        text = "분획팀 분획3파트";
                    }
                    if(i == 82) {
                        text = "분획팀 분획3파트";
                    }if(i == 83) {
                        text = "분획팀 분획3파트";
                    }
                    if(i == 84) {
                        text = "분획팀 분획3파트";
                    }
                    if(i == 85) {
                        text = "분획팀 분획3파트";
                    }if(i == 86) {
                        text = "분획팀 분획3파트";
                    }
                    if(i == 87) {
                        text = "분획팀 분획3파트";
                    }if(i == 88) {
                        text = "분획팀 분획3파트";
                    }
                    if(i == 89) {
                        text = "정제팀 정제3파트";
                    }if(i == 90) {
                        text = "정제팀 정제3파트";
                    }if(i == 91) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 92) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 93) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 94) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 95) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 96) {
                        text = "정제팀 정제3파트";
                    }if(i == 97) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 98) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 99) {
                        text = "정제팀 정제3파트";
                    }if(i == 100) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 101) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 102) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 103) {
                        text = "정제팀 정제3파트";
                    }if(i == 104) {
                        text = "정제팀 정제3파트";
                    }if(i == 105) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 106) {
                        text = "정제팀 정제3파트";
                    }if(i == 107) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 108) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 109) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 110) {
                        text = "정제팀 정제3파트";
                    }
                    if(i == 111) {
                        text = "정제팀 정제3파트";
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
