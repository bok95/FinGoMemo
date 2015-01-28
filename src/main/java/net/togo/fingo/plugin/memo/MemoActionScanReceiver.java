package net.togo.fingo.plugin.memo;


import java.util.HashMap;

import fingo.plugin.IExternalFingoAction;

public class MemoActionScanReceiver extends AbstractActionScanReceiver
		implements IExternalFingoAction {

	@Override
	public String getClassName() {
		return MemoActivity.class.getName();
	}

	@Override
	public String getDescription() {
		return context.getResources().getString(R.string.action_description);
	}

	@Override
	public String getPackageName() {
		return context.getPackageName();
	}

	@Override
	public String getIcon() {
		return "memo_recording";
	}

	@Override
	public String getSubject() {
		return context.getResources().getString(R.string.action_title);
	}

	@Override
	public Type getType() {
		return Type.TOGGLE;
	}

	@Override
	public HashMap<State, String> getIcons() {
		HashMap<State, String> icons = new HashMap<IExternalFingoAction.State, String>();
		icons.put(State.DEFAULT, "memo_off");
		icons.put(State.TOGGLE_FIRST, "memo_off");
		icons.put(State.TOGGLE_SECOND, "memo_recording");
		return icons;
	}

}
