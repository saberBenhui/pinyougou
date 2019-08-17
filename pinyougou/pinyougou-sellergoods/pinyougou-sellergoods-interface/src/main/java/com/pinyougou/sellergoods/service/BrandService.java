package com.pinyougou.sellergoods.service;

import com.github.pagehelper.PageInfo;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.service.BaseService;

import java.util.List;
import java.util.Map;

public interface BrandService extends BaseService<TbBrand>{
    List<TbBrand> queryAll();

    List<TbBrand> testPage(Integer pageNum, Integer pageSize);

    /**
     * 根据条件搜索
     * @param pageNum 页号
     * @param pageSize 页大小
     * @param brand 搜索条件
     * @return 分页信息
     */
    PageInfo search(Integer pageNum, Integer pageSize, TbBrand brand);

    List<Map<String,Object>> selectOptionList();
}
