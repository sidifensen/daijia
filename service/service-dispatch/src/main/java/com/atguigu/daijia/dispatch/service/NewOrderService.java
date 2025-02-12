package com.atguigu.daijia.dispatch.service;

import com.atguigu.daijia.model.vo.dispatch.NewOrderTaskVo;
import com.atguigu.daijia.model.vo.order.NewOrderDataVo;

import java.util.List;

public interface NewOrderService {

    //创建并启动新订单任务
    Long addAndStartTask(NewOrderTaskVo newOrderTaskVo);

    //执行任务:搜索附近代驾司机
    void executeTask(Long logId);

    List<NewOrderDataVo> findNewOrderQueueData(Long driverId);

    Boolean clearNewOrderQueueData(Long driverId);
}
