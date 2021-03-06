package com.sample.dtables;

import com.sample.model.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageRuleUnit implements RuleUnitData {
    
    private DataStore<Message> messages = DataSource.createStore();
}
