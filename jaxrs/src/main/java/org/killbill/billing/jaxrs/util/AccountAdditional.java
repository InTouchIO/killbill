package org.killbill.billing.jaxrs.util;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;

public class AccountAdditional {

    public static final String dob = "dob";
    public static final String gender = "gender";
    public static final String idNumber = "idNumber";
    public static final String landline = "landline";
    public static final String lastName = "lastName";
    public static final String middleName = "middleName";
    public static final String nationality = "nationality";
    public static final String other = "other";
    public static final String suburb = "suburb";
    public static final String title = "title";
    public static final String uploadFile = "uploadFile";
    public static final String customPhones = "customPhones";
    public static final String accountMatters = "accountMatters";


    public static ImmutableList<String> enumIteration() {
        return ImmutableList.<String>copyOf(Arrays.asList(
                                                dob,
                                                gender,
                                                idNumber,
                                                landline,
                                                lastName,
                                                middleName,
                                                nationality,
                                                other,
                                                suburb,
                                                title,
                                                uploadFile,
                                                customPhones,
                                                accountMatters));
    }
}
