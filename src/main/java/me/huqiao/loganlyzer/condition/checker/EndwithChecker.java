package me.huqiao.loganlyzer.condition.checker;

public class EndwithChecker implements ConditionChecker {

	@Override
	public boolean check(String value, Object pattern, Object pattern2) {
		if(pattern instanceof String){
			return pattern.toString().endsWith(value);
		}
		return false;
	}

}
