package com.sum_news_BE.web.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class NewsArticleResponseDTO { //뉴스 목록 DTO
    private Integer id;

    private String title;

    private String summaryText;

    private String source;

    private LocalDateTime publishedAt;
}
