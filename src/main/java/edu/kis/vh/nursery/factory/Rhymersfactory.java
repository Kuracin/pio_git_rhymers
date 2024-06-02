package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultRhymer;

    public interface Rhymersfactory {
    
        public DefaultRhymer getStandardRhymer();
        // TODO: modifier 'public' needs to be deleted - redundant for interface members
        public DefaultRhymer getFalseRhymer();
        // TODO: modifier 'public' needs to be deleted - redundant for interface members

        public DefaultRhymer getFIFORhymer();
        // TODO: modifier 'public' needs to be deleted - redundant for interface members

        public DefaultRhymer getHanoiRhymer();
        // TODO: modifier 'public' needs to be deleted - redundant for interface members

    }
