package com.yuti.mainserver.domain.youtuber.api;

import com.yuti.mainserver.domain.youtuber.Service.YoutuberService;
import com.yuti.mainserver.global.api.BasicResponse;
import com.yuti.mainserver.global.api.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class YoutuberApiController {

    private final YoutuberService youtuberService;

    @GetMapping("/api/v1/youtubers/{keyword}")
    public ResponseEntity<? extends BasicResponse> searchYoutuber(@Validated @PathVariable String keyword) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(new CommonResponse<>(youtuberService.searchYoutuber(keyword)));
    }

}