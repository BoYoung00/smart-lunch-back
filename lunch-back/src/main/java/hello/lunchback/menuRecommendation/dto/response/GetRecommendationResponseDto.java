package hello.lunchback.menuRecommendation.dto.response;

import hello.lunchback.common.response.ResponseCode;
import hello.lunchback.common.response.ResponseDto;
import hello.lunchback.common.response.ResponseMessage;
import hello.lunchback.menuManagement.entity.MenuEntity;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public class GetRecommendationResponseDto extends ResponseDto {

    private final List<MenuEntity> list = new ArrayList<>();

    public GetRecommendationResponseDto(List<MenuEntity> allMenu) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.list.addAll(allMenu);
    }

    public static ResponseEntity<? super  GetRecommendationResponseDto> success(List<MenuEntity> allMenu) {
        GetRecommendationResponseDto result = new GetRecommendationResponseDto(allMenu);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}