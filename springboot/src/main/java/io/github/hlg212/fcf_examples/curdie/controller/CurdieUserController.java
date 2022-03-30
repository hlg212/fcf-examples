package io.github.hlg212.fcf_examples.curdie.controller;

import io.github.hlg212.fcf.web.controller.CurdieController;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.hlg212.fcf.web.controller.CurdController;
import io.github.hlg212.fcf_examples.curdie.model.bo.CurdieUserBo;
import io.github.hlg212.fcf_examples.curdie.model.qco.CurdieUserQco;

/** 
 * CurdieUserController
 *
 * @author huanglg
 * @date 2022-03-24
 */
@RestController
@RequestMapping("/curdieUser")
@Api(value="CurdieUser控制器",tags={"CurdieUser"})
public class CurdieUserController implements CurdieController<CurdieUserBo, CurdieUserQco> {
	
}
