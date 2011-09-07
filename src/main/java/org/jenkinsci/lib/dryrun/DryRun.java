package org.jenkinsci.lib.dryrun;

import hudson.ExtensionPoint;
import hudson.Launcher;
import hudson.model.AbstractBuild;
import hudson.model.BuildListener;

import java.io.IOException;

/**
 * @author Gregory Boissinot
 */
public interface DryRun extends ExtensionPoint {

    public abstract boolean performDryRun(AbstractBuild<?, ?> build, Launcher launcher, BuildListener listener) throws InterruptedException, IOException;
}
