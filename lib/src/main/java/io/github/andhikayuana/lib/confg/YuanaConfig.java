package io.github.andhikayuana.lib.confg;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 6/21/17
 */

public class YuanaConfig {

    private String appName;

    private YuanaConfig(Builder builder) {
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

        public YuanaConfig build() {
            return new YuanaConfig(this);
        }
    }
}

