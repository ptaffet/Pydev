/* 
 * Copyright (C) 2006, 2007  Dennis Hunziker, Ueli Kistler 
 */

package org.python.pydev.refactoring.tests.adapter;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.python.pydev.core.ICodeCompletionASTManager;
import org.python.pydev.core.IInterpreterManager;
import org.python.pydev.core.IModule;
import org.python.pydev.core.IPythonNature;
import org.python.pydev.core.IPythonPathNature;
import org.python.pydev.core.IToken;

public class PythonNatureStub implements IPythonNature{

	public ICodeCompletionASTManager getAstManager() {
		return new CodeCompletionASTManagerStub();
	}

	public IToken[] getBuiltinCompletions() {
		throw new RuntimeException("Not implemented");
	}

	public IModule getBuiltinMod() {
		throw new RuntimeException("Not implemented");
	}

	public File getCompletionsCacheDir() {
		throw new RuntimeException("Not implemented");
	}

	public String getDefaultVersion() {
		throw new RuntimeException("Not implemented");
	}

	public IPythonPathNature getPythonPathNature() {
		throw new RuntimeException("Not implemented");
	}

	public int getRelatedId() throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public IInterpreterManager getRelatedInterpreterManager() {
		throw new RuntimeException("Not implemented");
	}

	public String getVersion() throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public boolean isJython() throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public boolean isPython() throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public void rebuildPath() {
		throw new RuntimeException("Not implemented");
	}

	public void rebuildPath(String defaultSelectedInterpreter, IProgressMonitor monitor) {
		throw new RuntimeException("Not implemented");
	}

	public String resolveModule(File file) {
		throw new RuntimeException("Not implemented");
	}

	public void saveAstManager() {
		throw new RuntimeException("Not implemented");
	}

	public void setBuiltinCompletions(IToken[] toks) {
		throw new RuntimeException("Not implemented");
	}

	public void setBuiltinMod(IModule mod) {
		throw new RuntimeException("Not implemented");
	}

	public void setVersion(String version) throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public void configure() throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public void deconfigure() throws CoreException {
		throw new RuntimeException("Not implemented");
	}

	public IProject getProject() {
		throw new RuntimeException("Not implemented");
	}

	public void setProject(IProject project) {
		throw new RuntimeException("Not implemented");
	}

	public int getGrammarVersion() {
		throw new RuntimeException("Not implemented");
	}

	public void endRequests() {
		throw new RuntimeException("Not implemented");
	}

	public boolean isResourceInPythonpath(IResource resource) {
		throw new RuntimeException("Not implemented");
	}

	public boolean isResourceInPythonpath(String resource) {
		throw new RuntimeException("Not implemented");
	}

	public String resolveModule(String fileAbsolutePath) {
		throw new RuntimeException("Not implemented");
	}

	public String resolveModule(IResource resource) {
		throw new RuntimeException("Not implemented");
	}

	public boolean startRequests() {
		throw new RuntimeException("Not implemented");
	}

}
