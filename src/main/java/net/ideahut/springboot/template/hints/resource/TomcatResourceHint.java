package net.ideahut.springboot.template.hints.resource;

import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;

public class TomcatResourceHint implements RuntimeHintsRegistrar {

	@Override
	public void registerHints(RuntimeHints hints, ClassLoader loader) {
		//hints.resources().reg
		//hints.reflection().
	}

}
