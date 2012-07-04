/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gephi.builder;

import org.gephi.bundler.FDEBBundlerMultithreading;
import org.gephi.edgelayout.spi.EdgeLayout;
import org.gephi.edgelayout.spi.EdgeLayoutBuilder;
import org.gephi.fdeb.FDEBBundlerParameters;
import org.gephi.layout.spi.LayoutUI;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author megaterik
 */
@ServiceProvider(service = EdgeLayoutBuilder.class)
public class FDEBMultithreadingBuilder implements EdgeLayoutBuilder{

    @Override
    public String getName() {
        return "2 Multithreaded FDEB";
    }

    @Override
    public LayoutUI getUI() {
        return null;
    }

    @Override
    public EdgeLayout buildLayout() {
       return new FDEBBundlerMultithreading(this, new FDEBBundlerParameters());
    }
    
}