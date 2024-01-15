package com.easybusticket.utilities;

import java.io.File;

/**
 * @author Ismail Koembe
 */
public class GetAbsolutePath {

    public static String getAbsolutePath(String relativePath) {
        // Get the project's base directory
        String baseDirectory = System.getProperty("user.dir");

        // Construct the absolute path using File.separator for platform independence
        return new File(baseDirectory, relativePath).getAbsolutePath();
    }
}
