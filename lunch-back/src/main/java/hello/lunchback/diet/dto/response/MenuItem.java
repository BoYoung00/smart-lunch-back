package hello.lunchback.diet.dto.response;

import hello.lunchback.menuManagement.entity.MenuEntity;
import hello.lunchback.orderManagement.entity.OrderDetailEntity;
import hello.lunchback.orderManagement.entity.OrderEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class MenuItem {

    private String menuName;
    private Integer calorie;
    private Integer carbs;
    private Integer protein;
    private Integer fat;


    public MenuItem(MenuEntity byMenuName) {
        this.menuName = byMenuName.getMenuName();
        this.calorie = byMenuName.getCalorie();
        this.carbs = byMenuName.getCarbs();
        this.protein = byMenuName.getProtein();
        this.fat = byMenuName.getFat();
    }
}
