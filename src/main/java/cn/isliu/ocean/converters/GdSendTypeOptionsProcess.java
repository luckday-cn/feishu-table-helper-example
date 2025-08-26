package cn.isliu.ocean.converters;

import cn.isliu.core.converters.OptionsValueProcess;
import cn.isliu.ocean.enums.GdSendTypeEnum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GdSendTypeOptionsProcess implements OptionsValueProcess<List<String>> {
    @Override
    public List<String> process() {
        return Arrays.stream(GdSendTypeEnum.values())
                .map(GdSendTypeEnum::getDesc)
                .filter(item -> item.contains("优选"))
                .collect(Collectors.toList());
    }
}
