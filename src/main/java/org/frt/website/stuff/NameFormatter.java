package org.frt.website.stuff;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;

public class NameFormatter {

    public static String format(String name) {
        return StringUtils.stripAccents(name).toLowerCase().replaceAll(" ", "-");
    }

}
