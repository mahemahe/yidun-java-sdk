package com.netease.yidun.sdk.antispam.crawler.v3.callback;

import java.util.Collections;
import java.util.List;

import com.netease.yidun.sdk.antispam.AntispamRequester;
import com.netease.yidun.sdk.antispam.callback.AbstractCallbackHandler;
import com.netease.yidun.sdk.antispam.callback.CallbackProfile;
import com.netease.yidun.sdk.antispam.crawler.v3.callback.request.CrawlerResourceCallbackV3Request;
import com.netease.yidun.sdk.antispam.crawler.v3.callback.response.CrawlerResourceCallbackV3Response;
import com.netease.yidun.sdk.core.http.ProtocolEnum;

public abstract class CrawlerCallback
        extends AbstractCallbackHandler<CrawlerResourceCallbackV3Response.CrawlerResourceResult> {

    public CrawlerCallback() {
        super(null, new CallbackProfile(null, 1));
    }

    public CrawlerCallback(CallbackProfile profile) {
        super(null, profile);
    }

    public CrawlerCallback(AntispamRequester antispamRequester, CallbackProfile profile) {
        super(antispamRequester, profile);
    }

    @Override
    protected List<CrawlerResourceCallbackV3Response.CrawlerResourceResult> requestCallback(String businessId) {
        CrawlerResourceCallbackV3Request request = new CrawlerResourceCallbackV3Request();
        CrawlerResourceCallbackV3Response callbackResponse = antispamRequester.getCrawlerCallbackClient()
                .callbackResource(request);
        if (callbackResponse == null) {
            return Collections.emptyList();
        }
        return callbackResponse.getResult();
    }

}
