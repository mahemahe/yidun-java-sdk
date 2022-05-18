package com.netease.yidun.sdk.antispam.image.v5.check.async.request;

import com.netease.yidun.sdk.antispam.image.v5.check.ImageV5CheckRequest;
import com.netease.yidun.sdk.antispam.image.v5.check.async.response.ImageV5AsyncCheckResp;

public class ImageV5AsyncCheckRequest extends ImageV5CheckRequest<ImageV5AsyncCheckResp> {

    @Override
    protected String requestUriPath() {
        return "/v5/image/asyncCheck";
    }

    @Override
    public Class<ImageV5AsyncCheckResp> getResponseClass() {
        return ImageV5AsyncCheckResp.class;
    }
}
