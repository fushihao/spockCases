package com.example.demo

import groovy.transform.TypeChecked
import org.junit.runner.RunWith
import org.powermock.api.mockito.PowerMockito
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner
import org.powermock.modules.junit4.PowerMockRunnerDelegate
import org.spockframework.runtime.Sputnik
import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author fushihao* @date 2023/10/5 4:08 下午
 */
@RunWith(PowerMockRunner.class)
@PowerMockRunnerDelegate(Sputnik.class)
//@PrepareForTest([CommonUtils.class])
//@TypeChecked
class PlusServiceTest extends Specification{


    def tester=new PlusService()

    @Unroll
    def "test plus"(){

        given:
//        PowerMockito.mockStatic(CommonUtils.class)
//        PowerMockito.when(CommonUtils.generation()).thenReturn(1)

        when:
        def result=tester.plus(a,b)

        then:
        result==c

        where:

        a|b|c
        1|1|3
        3|2|6

    }





}
