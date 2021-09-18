package com.doubao.statemachine.extend.manager;

import java.util.List;

import com.doubao.statemachine.core.StateMachine;
import com.doubao.statemachine.extend.model.MachineMetaInfo;

/**
 * StateMachineManager
 *
 * @author doubao
 * @date 2021/4/30
 */
public interface StateMachineManager {
	/**
	 * get metaInfo list
	 *
	 * @return list
	 */
	List<MachineMetaInfo> metaInfoList();

	/**
	 * get metaInfo by machineId
	 *
	 * @param id id
	 * @return metaInfo
	 */
	MachineMetaInfo metaInfoById(String id);

	/**
	 * get stateMachine group
	 *
	 * @return
	 */
	String group();
	/**
	 * get machine by id
	 *
	 * @param id id
	 * @return
	 */
	<S, E, C> StateMachine<S, E, C> getById(String id);

	/**
	 * select one machine by content
	 * if have multiple machines ,will choose the first one
	 *
	 * @param content content
	 * @return stateMachine
	 * if cannot find,return null
	 */
	<S, E, C> StateMachine<S, E, C> selectOneByContent(C content);
}
