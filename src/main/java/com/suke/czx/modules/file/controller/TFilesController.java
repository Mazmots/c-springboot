package com.suke.czx.modules.file.controller;

import java.util.Map;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.suke.czx.common.annotation.AuthIgnore;
import org.springframework.web.bind.annotation.*;
import com.suke.czx.modules.file.entity.TFiles;
import com.suke.czx.modules.file.service.TFilesService;
import com.suke.zhjg.common.autofull.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import com.suke.czx.common.annotation.SysLog;
import com.suke.czx.common.base.AbstractController;


/**
 * 
 *
 * @author cao
 * @email object_czx@163.com
 * @date 2023-03-21 16:51:18
 */
@RestController
@AllArgsConstructor
@RequestMapping("/file/doc")
@Api(value = "TFilesController", tags = "")
public class TFilesController extends AbstractController {
    private final TFilesService tFilesService;

    /**
     * 列表
     */
    @AuthIgnore
    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        QueryWrapper<TFiles> queryWrapper = new QueryWrapper<>();
        final String keyword = mpPageConvert.getKeyword(params);
        if (StrUtil.isNotEmpty(keyword)) {

        }
        IPage<TFiles> listPage = tFilesService.page(mpPageConvert.<TFiles>pageParamConvert(params), queryWrapper);
        return R.ok().setData(listPage);
    }


    /**
     * 新增
     */
    @ApiOperation(value = "新增数据")
    @SysLog("新增数据")
                @PostMapping("/save")
            public R save(@RequestBody TFiles tFiles) {
            tFilesService.save(tFiles);
        return R.ok();
    }


    /**
     * 修改
     */
    @ApiOperation(value = "修改数据")
    @SysLog("修改数据")
                @PostMapping("/update")
            public R update(@RequestBody TFiles tFiles) {
            tFilesService.updateById(tFiles);
        return R.ok();
    }


    /**
     * 删除
     */
    @ApiOperation(value = "删除数据")
    @SysLog("删除数据")
                @PostMapping("/delete")
            public R delete(@RequestBody TFiles tFiles) {
            tFilesService.removeById(tFiles.getId());
        return R.ok();
    }

}
