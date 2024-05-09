package com.automation.utils.helpers.annotations;

public @interface TestInfo {
    String[] testCaseId() default {};
    String component() default "";
}
