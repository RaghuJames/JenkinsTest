package com.restaurent.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.restaurent.model.Items;
import com.restaurent.model.SubMenuItemsDto;

public interface ItemsRepository extends JpaRepository<Items, String> {

	@Query("SELECT new com.restaurent.model.SubMenuItemsDto(m.menuCode,m.menuDesc,s.subMenuCode,s.subMenuDesc,i.itemCode,i.itemDesc) FROM MainMenu m LEFT JOIN  SubMenu s ON m.menuCode = s.mainMenuCode LEFT JOIN Items i ON s.subMenuCode = i.itemsSubMenuCode")
	List<SubMenuItemsDto> fetchSubItemsDataLeftJoin();

}
