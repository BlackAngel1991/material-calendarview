/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.prolificinteractive.materialcalendarview.format.jalali.date.format;

import com.jalalicalendarutil.JalaliCalendar;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;


public class SimpleJalaliDateFormat extends SimpleDateFormat {
    private static String TAG=SimpleJalaliDateFormat.class.getSimpleName();


  /*  private static final String[] mJalaliMonths={"فروردین","اردیبهشت","خرداد","تیر","مرداد","شهریور","مهر",
            "آبان","آذر","دی","بهمن","اسفند"};

    private boolean bIsJalali;*/

    public SimpleJalaliDateFormat() {
        super();
        checkLocale(Locale.getDefault());

    }
    public SimpleJalaliDateFormat(String pattern) {
        super(pattern);
        checkLocale(Locale.getDefault());
    }

    public SimpleJalaliDateFormat(String template, DateFormatSymbols value) {
        super(template, value);
        checkLocale(Locale.getDefault());


    }

    public SimpleJalaliDateFormat(String template, Locale locale) {
        super(template, locale);
        checkLocale(locale);


    }
    private void checkLocale(Locale locale)
    {

        if (locale.getLanguage().equals("fa"))
        {
            calendar = new JalaliCalendar(locale);
           // bIsJalali=true;
        }
        else
        {
            calendar = new GregorianCalendar(locale);
           // bIsJalali=false;
        }
    }

}
