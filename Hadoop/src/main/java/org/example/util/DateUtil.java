package org.example.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
        public static String longToString(String dateFormat,Long millSec) {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            Date date= new Date(millSec);
            return sdf.format(date);
        }

        public static String DateToString(String dateFormat,Date date) {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            return sdf.format(date);
        }

    }

