package io.github.andhikayuana.lib;

import android.app.Application;
import android.content.Context;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/12/17
 */

public class Yuana {

    private static Application sAplication;
    private static Context sContext;
    private static Config sConfig;

    public static void init(Application application, Config config) {
        sAplication = application;
        sContext = sAplication.getApplicationContext();
        sConfig = config;
    }


    public static class Config {
        private String appName;

        private Config(Builder builder) {
            this.appName = builder.appName;
        }

        public static Builder Builder() {
            return new Builder();
        }


        public static final class Builder {
            private String appName;

            private Builder() {
            }

            public Builder setAppName(String appName) {
                this.appName = appName;
                return this;
            }

            public Config build() {
                return new Config(this);
            }
        }
    }
}
