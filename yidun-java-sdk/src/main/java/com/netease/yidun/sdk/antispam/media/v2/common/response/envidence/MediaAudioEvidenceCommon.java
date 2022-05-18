package com.netease.yidun.sdk.antispam.media.v2.common.response.envidence;

import java.util.List;

/**
 * 融媒体机审-音频证据信息
 */
public class MediaAudioEvidenceCommon {
    private Integer suggestion;
    private Integer status;
    /**
     * 失败原因
     */
    private Integer failureReason;
    private Integer resultType;
    private Long checkTime;
    private Long duration;
    private List<SegmentsInfo> segments;

    public Integer getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Integer suggestion) {
        this.suggestion = suggestion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(Integer failureReason) {
        this.failureReason = failureReason;
    }

    public Integer getResultType() {
        return resultType;
    }

    public void setResultType(Integer resultType) {
        this.resultType = resultType;
    }

    public Long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Long checkTime) {
        this.checkTime = checkTime;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public List<SegmentsInfo> getSegments() {
        return segments;
    }

    public void setSegments(List<SegmentsInfo> segments) {
        this.segments = segments;
    }

    public static class SegmentsInfo {
        private Integer startTime;
        private Integer endTime;
        private String content;
        private Integer type;
        private List<AudioLabelInfo> labels;

        public Integer getStartTime() {
            return startTime;
        }

        public void setStartTime(Integer startTime) {
            this.startTime = startTime;
        }

        public Integer getEndTime() {
            return endTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public Integer getType() {
            return type;
        }

        public void setType(Integer type) {
            this.type = type;
        }

        public List<AudioLabelInfo> getLabels() {
            return labels;
        }

        public void setLabels(List<AudioLabelInfo> labels) {
            this.labels = labels;
        }
    }

    public static class AudioLabelInfo {
        private int label;
        private List<AudioSubLabel> subLabels;
        private int level;

        public int getLabel() {
            return label;
        }

        public void setLabel(int label) {
            this.label = label;
        }

        public List<AudioSubLabel> getSubLabels() {
            return subLabels;
        }

        public void setSubLabels(List<AudioSubLabel> subLabels) {
            this.subLabels = subLabels;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }

    public static class AudioSubLabel {
        private String subLabel;
        private AudioSubLabelDetail details;

        public String getSubLabel() {
            return subLabel;
        }

        public void setSubLabel(String subLabel) {
            this.subLabel = subLabel;
        }

        public AudioSubLabelDetail getDetails() {
            return details;
        }

        public void setDetails(AudioSubLabelDetail details) {
            this.details = details;
        }
    }

    public static class AudioSubLabelDetail {
        /**
         * 命中内容
         */
        private List<HintDetail> hitInfos;
        /**
         * 自定义敏感词线索分类信息
         */
        private List<Keywords> keywords;
        /**
         * 自定义名单线索分类信息
         */
        private List<LibResult> libInfos;

        public List<HintDetail> getHitInfos() {
            return hitInfos;
        }

        public void setHitInfos(List<HintDetail> hitInfos) {
            this.hitInfos = hitInfos;
        }

        public List<Keywords> getKeywords() {
            return keywords;
        }

        public void setKeywords(List<Keywords> keywords) {
            this.keywords = keywords;
        }

        public List<LibResult> getLibInfos() {
            return libInfos;
        }

        public void setLibInfos(List<LibResult> libInfos) {
            this.libInfos = libInfos;
        }
    }

    public static class LibResult {
        /**
         * 名单类型
         */
        private Integer listType;
        /**
         * 名单内容
         */
        private String entity;

        public Integer getListType() {
            return listType;
        }

        public void setListType(Integer listType) {
            this.listType = listType;
        }

        public String getEntity() {
            return entity;
        }

        public void setEntity(String entity) {
            this.entity = entity;
        }
    }

    public static class Keywords {
        /**
         * 自定义添加敏感词
         */
        private String word;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }
    }

    public static class HintDetail {
        /**
         * 命中的敏感词或者声纹检测的分值
         */
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
