package hello.lunchback.orderManagement.dto.response;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderHistoryItem {
    private String orderDate;
    private Integer orderId;
    private String storeImage;
    private String storeName;
    private List<String> menuName = new ArrayList<>();
    private Integer totalPrice;
    // 주문 날짜, 가게 사진, 가게명, 메뉴, 총 가격

}
