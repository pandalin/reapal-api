package com.jvv.reapal.facade.req

import org.hibernate.validator.constraints.NotEmpty

/**
 * Created by IntelliJ IDEA
 * <p>〈类详细描述〉 </p>
 * 〈功能详细描述〉
 *
 * @author linxm
 * @date 2017/5/9
 * @time 9:18
 * @version 1.0
 */
class SendSmsReq extends AbstractReq{

    @NotEmpty(message = "订单号不能为空")
    String order_no
    @NotEmpty(message = "会员号不能为空")
    String member_id
}
