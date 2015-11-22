package at.ac.tuwien.big.views.view.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.views.view.services.ViewGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalViewParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'welcome'", "'viewgroup'", "'{'", "','", "'}'", "'start'", "'index-view'", "'handles'", "'view-description'", "'link'", "'create-view'", "'read-view'", "'update-view'", "'delete-view'", "'elementgroup'", "'with'", "'comparison-condition'", "':'", "'?'", "'composite-condition'", "'('", "')'", "'list'", "'table'", "'column'", "'long'", "'text'", "'format'", "'date-time-picker'", "'selection'", "'selection-item'", "'enum-literal'", "'.'", "'vertical'", "'horizontal'", "'Hide'", "'Show'", "'Enable'", "'Disable'", "'=='", "'<'", "'>'", "'&&'", "'||'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalViewParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalViewParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalViewParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g"; }



     	private ViewGrammarAccess grammarAccess;
     	
        public InternalViewParser(TokenStream input, ViewGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ViewModel";	
       	}
       	
       	@Override
       	protected ViewGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleViewModel"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:68:1: entryRuleViewModel returns [EObject current=null] : iv_ruleViewModel= ruleViewModel EOF ;
    public final EObject entryRuleViewModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewModel = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:69:2: (iv_ruleViewModel= ruleViewModel EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:70:2: iv_ruleViewModel= ruleViewModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleViewModel_in_entryRuleViewModel75);
            iv_ruleViewModel=ruleViewModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewModel"


    // $ANTLR start "ruleViewModel"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:77:1: ruleViewModel returns [EObject current=null] : ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )? ;
    public final EObject ruleViewModel() throws RecognitionException {
        EObject current = null;

        EObject lv_viewGroups_0_0 = null;

        EObject lv_viewGroups_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:80:28: ( ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:1: ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )?
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:1: ( ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=12)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:2: ( (lv_viewGroups_0_0= ruleViewGroup ) ) ( (lv_viewGroups_1_0= ruleViewGroup ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:81:2: ( (lv_viewGroups_0_0= ruleViewGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:82:1: (lv_viewGroups_0_0= ruleViewGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:82:1: (lv_viewGroups_0_0= ruleViewGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:83:3: lv_viewGroups_0_0= ruleViewGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewModelAccess().getViewGroupsViewGroupParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleViewGroup_in_ruleViewModel131);
                    lv_viewGroups_0_0=ruleViewGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewModelRule());
                      	        }
                             		add(
                             			current, 
                             			"viewGroups",
                              		lv_viewGroups_0_0, 
                              		"ViewGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:99:2: ( (lv_viewGroups_1_0= ruleViewGroup ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:100:1: (lv_viewGroups_1_0= ruleViewGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:100:1: (lv_viewGroups_1_0= ruleViewGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:101:3: lv_viewGroups_1_0= ruleViewGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewModelAccess().getViewGroupsViewGroupParserRuleCall_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleViewGroup_in_ruleViewModel152);
                    	    lv_viewGroups_1_0=ruleViewGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"viewGroups",
                    	              		lv_viewGroups_1_0, 
                    	              		"ViewGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewModel"


    // $ANTLR start "entryRuleViewGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:125:1: entryRuleViewGroup returns [EObject current=null] : iv_ruleViewGroup= ruleViewGroup EOF ;
    public final EObject entryRuleViewGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewGroup = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:126:2: (iv_ruleViewGroup= ruleViewGroup EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:127:2: iv_ruleViewGroup= ruleViewGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleViewGroup_in_entryRuleViewGroup190);
            iv_ruleViewGroup=ruleViewGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewGroup200); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewGroup"


    // $ANTLR start "ruleViewGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:134:1: ruleViewGroup returns [EObject current=null] : ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleViewGroup() throws RecognitionException {
        EObject current = null;

        Token lv_welcomeViewGroup_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_views_4_0 = null;

        EObject lv_views_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:137:28: ( ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:1: ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:1: ( ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:2: ( (lv_welcomeViewGroup_0_0= 'welcome' ) )? otherlv_1= 'viewgroup' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )? otherlv_7= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:138:2: ( (lv_welcomeViewGroup_0_0= 'welcome' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:139:1: (lv_welcomeViewGroup_0_0= 'welcome' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:139:1: (lv_welcomeViewGroup_0_0= 'welcome' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:140:3: lv_welcomeViewGroup_0_0= 'welcome'
                    {
                    lv_welcomeViewGroup_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleViewGroup243); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_welcomeViewGroup_0_0, grammarAccess.getViewGroupAccess().getWelcomeViewGroupWelcomeKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getViewGroupRule());
                      	        }
                             		setWithLastConsumed(current, "welcomeViewGroup", true, "welcome");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleViewGroup269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getViewGroupAccess().getViewgroupKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:157:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:158:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:158:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:159:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getViewGroupAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleViewGroup290);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getViewGroupRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleViewGroup302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getViewGroupAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:179:1: ( ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=17)||(LA5_0>=44 && LA5_0<=45)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:179:2: ( (lv_views_4_0= ruleView ) ) (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:179:2: ( (lv_views_4_0= ruleView ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:180:1: (lv_views_4_0= ruleView )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:180:1: (lv_views_4_0= ruleView )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:181:3: lv_views_4_0= ruleView
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getViewGroupAccess().getViewsViewParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleViewGroup324);
                    lv_views_4_0=ruleView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getViewGroupRule());
                      	        }
                             		add(
                             			current, 
                             			"views",
                              		lv_views_4_0, 
                              		"View");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:197:2: (otherlv_5= ',' ( (lv_views_6_0= ruleView ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:197:4: otherlv_5= ',' ( (lv_views_6_0= ruleView ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleViewGroup337); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getViewGroupAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:201:1: ( (lv_views_6_0= ruleView ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:202:1: (lv_views_6_0= ruleView )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:202:1: (lv_views_6_0= ruleView )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:203:3: lv_views_6_0= ruleView
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getViewGroupAccess().getViewsViewParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleView_in_ruleViewGroup358);
                    	    lv_views_6_0=ruleView();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getViewGroupRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"views",
                    	              		lv_views_6_0, 
                    	              		"View");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleViewGroup374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getViewGroupAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewGroup"


    // $ANTLR start "entryRuleView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:231:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:232:2: (iv_ruleView= ruleView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:233:2: iv_ruleView= ruleView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleView_in_entryRuleView410);
            iv_ruleView=ruleView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleView420); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:240:1: ruleView returns [EObject current=null] : (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        EObject this_ClassIndexView_0 = null;

        EObject this_ClassOperationView_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:243:28: ( (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:244:1: (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:244:1: (this_ClassIndexView_0= ruleClassIndexView | this_ClassOperationView_1= ruleClassOperationView )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=16 && LA6_0<=17)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=44 && LA6_0<=45)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:245:5: this_ClassIndexView_0= ruleClassIndexView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewAccess().getClassIndexViewParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClassIndexView_in_ruleView467);
                    this_ClassIndexView_0=ruleClassIndexView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassIndexView_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:255:5: this_ClassOperationView_1= ruleClassOperationView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewAccess().getClassOperationViewParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleClassOperationView_in_ruleView494);
                    this_ClassOperationView_1=ruleClassOperationView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassOperationView_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleClassIndexView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:271:1: entryRuleClassIndexView returns [EObject current=null] : iv_ruleClassIndexView= ruleClassIndexView EOF ;
    public final EObject entryRuleClassIndexView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassIndexView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:272:2: (iv_ruleClassIndexView= ruleClassIndexView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:273:2: iv_ruleClassIndexView= ruleClassIndexView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassIndexViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassIndexView_in_entryRuleClassIndexView529);
            iv_ruleClassIndexView=ruleClassIndexView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassIndexView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassIndexView539); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassIndexView"


    // $ANTLR start "ruleClassIndexView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:280:1: ruleClassIndexView returns [EObject current=null] : ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleClassIndexView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_0_0=null;
        Token otherlv_1=null;
        Token lv_header_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_description_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_link_9_0 = null;

        EObject lv_link_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:283:28: ( ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:1: ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:1: ( ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:2: ( (lv_startView_0_0= 'start' ) )? otherlv_1= 'index-view' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_header_3_0= RULE_STRING ) ) otherlv_4= 'handles' ( ( ruleQualifiedName ) ) otherlv_6= '{' (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )? ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )? otherlv_12= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:284:2: ( (lv_startView_0_0= 'start' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:285:1: (lv_startView_0_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:285:1: (lv_startView_0_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:286:3: lv_startView_0_0= 'start'
                    {
                    lv_startView_0_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClassIndexView582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_0_0, grammarAccess.getClassIndexViewAccess().getStartViewStartKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassIndexViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleClassIndexView608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClassIndexViewAccess().getIndexViewKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:303:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:304:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:304:1: (lv_name_2_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:305:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleClassIndexView629);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getClassIndexViewRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:321:2: ( (lv_header_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:322:1: (lv_header_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:322:1: (lv_header_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:323:3: lv_header_3_0= RULE_STRING
            {
            lv_header_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleClassIndexView646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_3_0, grammarAccess.getClassIndexViewAccess().getHeaderSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getClassIndexViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleClassIndexView663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getClassIndexViewAccess().getHandlesKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:343:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:344:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:344:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:345:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getClassIndexViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getClassClassCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleClassIndexView686);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleClassIndexView698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getClassIndexViewAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:362:1: (otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:362:3: otherlv_7= 'view-description' ( (lv_description_8_0= RULE_STRING ) )
                    {
                    otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleClassIndexView711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getClassIndexViewAccess().getViewDescriptionKeyword_7_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:366:1: ( (lv_description_8_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:367:1: (lv_description_8_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:367:1: (lv_description_8_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:368:3: lv_description_8_0= RULE_STRING
                    {
                    lv_description_8_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleClassIndexView728); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_8_0, grammarAccess.getClassIndexViewAccess().getDescriptionSTRINGTerminalRuleCall_7_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getClassIndexViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_8_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:384:4: ( ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:384:5: ( (lv_link_9_0= ruleLink ) ) (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:384:5: ( (lv_link_9_0= ruleLink ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:385:1: (lv_link_9_0= ruleLink )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:385:1: (lv_link_9_0= ruleLink )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:386:3: lv_link_9_0= ruleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getLinkLinkParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleClassIndexView757);
                    lv_link_9_0=ruleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassIndexViewRule());
                      	        }
                             		add(
                             			current, 
                             			"link",
                              		lv_link_9_0, 
                              		"Link");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:402:2: (otherlv_10= ',' ( (lv_link_11_0= ruleLink ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:402:4: otherlv_10= ',' ( (lv_link_11_0= ruleLink ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleClassIndexView770); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getClassIndexViewAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:406:1: ( (lv_link_11_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:407:1: (lv_link_11_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:407:1: (lv_link_11_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:408:3: lv_link_11_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getClassIndexViewAccess().getLinkLinkParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleClassIndexView791);
                    	    lv_link_11_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getClassIndexViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_11_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClassIndexView807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getClassIndexViewAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassIndexView"


    // $ANTLR start "entryRuleLink"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:436:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:437:2: (iv_ruleLink= ruleLink EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:438:2: iv_ruleLink= ruleLink EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLinkRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLink_in_entryRuleLink843);
            iv_ruleLink=ruleLink();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLink; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLink853); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:445:1: ruleLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:448:28: ( (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:449:1: (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:449:1: (otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:449:3: otherlv_0= 'link' ( (lv_label_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLink890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLinkAccess().getLinkKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:453:1: ( (lv_label_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:454:1: (lv_label_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:454:1: (lv_label_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:455:3: lv_label_1_0= RULE_STRING
            {
            lv_label_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLink907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_1_0, grammarAccess.getLinkAccess().getLabelSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleLink924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLinkAccess().getHandlesKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:475:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:476:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:476:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:477:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLinkRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLinkAccess().getTargetViewClassOperationViewCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleLink947);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleClassOperationView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:498:1: entryRuleClassOperationView returns [EObject current=null] : iv_ruleClassOperationView= ruleClassOperationView EOF ;
    public final EObject entryRuleClassOperationView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassOperationView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:499:2: (iv_ruleClassOperationView= ruleClassOperationView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:500:2: iv_ruleClassOperationView= ruleClassOperationView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassOperationViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleClassOperationView_in_entryRuleClassOperationView983);
            iv_ruleClassOperationView=ruleClassOperationView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassOperationView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassOperationView993); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassOperationView"


    // $ANTLR start "ruleClassOperationView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:507:1: ruleClassOperationView returns [EObject current=null] : (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView ) ;
    public final EObject ruleClassOperationView() throws RecognitionException {
        EObject current = null;

        EObject this_CreateView_0 = null;

        EObject this_ReadView_1 = null;

        EObject this_UpdateView_2 = null;

        EObject this_DeleteView_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:510:28: ( (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:511:1: (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:511:1: (this_CreateView_0= ruleCreateView | this_ReadView_1= ruleReadView | this_UpdateView_2= ruleUpdateView | this_DeleteView_3= ruleDeleteView )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==44) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt11=4;
                        }
                        break;
                    case 23:
                        {
                        alt11=3;
                        }
                        break;
                    case 22:
                        {
                        alt11=2;
                        }
                        break;
                    case 21:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 21:
                    {
                    alt11=1;
                    }
                    break;
                case 24:
                    {
                    alt11=4;
                    }
                    break;
                case 23:
                    {
                    alt11=3;
                    }
                    break;
                case 22:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA11_0==45) ) {
                switch ( input.LA(2) ) {
                case 16:
                    {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt11=4;
                        }
                        break;
                    case 23:
                        {
                        alt11=3;
                        }
                        break;
                    case 22:
                        {
                        alt11=2;
                        }
                        break;
                    case 21:
                        {
                        alt11=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 24:
                    {
                    alt11=4;
                    }
                    break;
                case 23:
                    {
                    alt11=3;
                    }
                    break;
                case 22:
                    {
                    alt11=2;
                    }
                    break;
                case 21:
                    {
                    alt11=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:512:5: this_CreateView_0= ruleCreateView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getCreateViewParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCreateView_in_ruleClassOperationView1040);
                    this_CreateView_0=ruleCreateView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CreateView_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:522:5: this_ReadView_1= ruleReadView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getReadViewParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReadView_in_ruleClassOperationView1067);
                    this_ReadView_1=ruleReadView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReadView_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:532:5: this_UpdateView_2= ruleUpdateView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getUpdateViewParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUpdateView_in_ruleClassOperationView1094);
                    this_UpdateView_2=ruleUpdateView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UpdateView_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:542:5: this_DeleteView_3= ruleDeleteView
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getClassOperationViewAccess().getDeleteViewParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeleteView_in_ruleClassOperationView1121);
                    this_DeleteView_3=ruleDeleteView();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DeleteView_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassOperationView"


    // $ANTLR start "entryRuleCreateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:558:1: entryRuleCreateView returns [EObject current=null] : iv_ruleCreateView= ruleCreateView EOF ;
    public final EObject entryRuleCreateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreateView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:559:2: (iv_ruleCreateView= ruleCreateView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:560:2: iv_ruleCreateView= ruleCreateView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCreateViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCreateView_in_entryRuleCreateView1156);
            iv_ruleCreateView=ruleCreateView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCreateView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCreateView1166); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCreateView"


    // $ANTLR start "ruleCreateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:567:1: ruleCreateView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleCreateView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:570:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:571:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:571:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:571:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'create-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:571:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:572:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:572:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:573:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleCreateView1212);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:589:2: ( (lv_startView_1_0= 'start' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:590:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:590:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:591:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCreateView1230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getCreateViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCreateView1256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCreateViewAccess().getCreateViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:608:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:609:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:609:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:610:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleCreateView1277);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:626:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:627:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:627:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:628:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCreateView1294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getCreateViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleCreateView1311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCreateViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:648:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:649:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:649:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:650:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCreateViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCreateViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleCreateView1334);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleCreateView1346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCreateViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:667:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:667:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCreateView1359); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCreateViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:671:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:672:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:672:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:673:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleCreateView1376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getCreateViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCreateViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:689:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=44 && LA15_0<=45)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:689:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:689:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:690:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:690:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:691:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCreateViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleCreateView1405);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:707:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:707:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleCreateView1418); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCreateViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:711:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:712:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:712:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:713:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCreateViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleCreateView1439);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCreateViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCreateView1455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getCreateViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCreateView"


    // $ANTLR start "entryRuleReadView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:741:1: entryRuleReadView returns [EObject current=null] : iv_ruleReadView= ruleReadView EOF ;
    public final EObject entryRuleReadView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:742:2: (iv_ruleReadView= ruleReadView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:743:2: iv_ruleReadView= ruleReadView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReadViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReadView_in_entryRuleReadView1491);
            iv_ruleReadView=ruleReadView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReadView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReadView1501); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReadView"


    // $ANTLR start "ruleReadView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:750:1: ruleReadView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleReadView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:753:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:754:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:754:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:754:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'read-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:754:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:755:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:755:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:756:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReadViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleReadView1547);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReadViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:772:2: ( (lv_startView_1_0= 'start' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:773:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:773:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:774:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleReadView1565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getReadViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleReadView1591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getReadViewAccess().getReadViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:791:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:792:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:792:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:793:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReadViewAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleReadView1612);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getReadViewRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:809:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:810:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:810:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:811:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReadView1629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getReadViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getReadViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleReadView1646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getReadViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:831:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:832:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:832:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:833:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReadViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getReadViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleReadView1669);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleReadView1681); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getReadViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:850:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:850:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleReadView1694); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getReadViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:854:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:855:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:855:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:856:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleReadView1711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getReadViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getReadViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:872:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=44 && LA19_0<=45)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:872:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:872:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:873:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:873:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:874:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReadViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleReadView1740);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReadViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:890:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:890:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleReadView1753); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getReadViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:894:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:895:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:895:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:896:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getReadViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleReadView1774);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getReadViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleReadView1790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getReadViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReadView"


    // $ANTLR start "entryRuleUpdateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:924:1: entryRuleUpdateView returns [EObject current=null] : iv_ruleUpdateView= ruleUpdateView EOF ;
    public final EObject entryRuleUpdateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdateView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:925:2: (iv_ruleUpdateView= ruleUpdateView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:926:2: iv_ruleUpdateView= ruleUpdateView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpdateViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUpdateView_in_entryRuleUpdateView1826);
            iv_ruleUpdateView=ruleUpdateView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpdateView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUpdateView1836); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUpdateView"


    // $ANTLR start "ruleUpdateView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:933:1: ruleUpdateView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleUpdateView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:936:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:937:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:937:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:937:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'update-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:937:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:938:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:938:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:939:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleUpdateView1882);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:955:2: ( (lv_startView_1_0= 'start' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==16) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:956:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:956:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:957:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleUpdateView1900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getUpdateViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleUpdateView1926); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUpdateViewAccess().getUpdateViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:974:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:975:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:975:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:976:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateViewAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateView1947);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:992:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:993:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:993:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:994:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUpdateView1964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getUpdateViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleUpdateView1981); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getUpdateViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1014:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1015:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1015:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1016:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getUpdateViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUpdateViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleUpdateView2004);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleUpdateView2016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getUpdateViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1033:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==19) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1033:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleUpdateView2029); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getUpdateViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1037:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1038:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1038:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1039:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleUpdateView2046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getUpdateViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUpdateViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1055:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=44 && LA23_0<=45)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1055:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1055:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1056:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1056:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1057:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUpdateViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleUpdateView2075);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1073:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==14) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1073:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleUpdateView2088); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getUpdateViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1077:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1078:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1078:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1079:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getUpdateViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleUpdateView2109);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getUpdateViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleUpdateView2125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getUpdateViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUpdateView"


    // $ANTLR start "entryRuleDeleteView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1107:1: entryRuleDeleteView returns [EObject current=null] : iv_ruleDeleteView= ruleDeleteView EOF ;
    public final EObject entryRuleDeleteView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteView = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1108:2: (iv_ruleDeleteView= ruleDeleteView EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1109:2: iv_ruleDeleteView= ruleDeleteView EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeleteViewRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeleteView_in_entryRuleDeleteView2161);
            iv_ruleDeleteView=ruleDeleteView();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeleteView; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeleteView2171); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeleteView"


    // $ANTLR start "ruleDeleteView"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1116:1: ruleDeleteView returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) ;
    public final EObject ruleDeleteView() throws RecognitionException {
        EObject current = null;

        Token lv_startView_1_0=null;
        Token otherlv_2=null;
        Token lv_header_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_layout_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elementGroups_10_0 = null;

        EObject lv_elementGroups_12_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1119:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1120:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1120:1: ( ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}' )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1120:2: ( (lv_layout_0_0= ruleLayout ) ) ( (lv_startView_1_0= 'start' ) )? otherlv_2= 'delete-view' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_header_4_0= RULE_STRING ) ) otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )? ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )? otherlv_13= '}'
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1120:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1121:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1121:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1122:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteViewAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleDeleteView2217);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1138:2: ( (lv_startView_1_0= 'start' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1139:1: (lv_startView_1_0= 'start' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1139:1: (lv_startView_1_0= 'start' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1140:3: lv_startView_1_0= 'start'
                    {
                    lv_startView_1_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDeleteView2235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_startView_1_0, grammarAccess.getDeleteViewAccess().getStartViewStartKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeleteViewRule());
                      	        }
                             		setWithLastConsumed(current, "startView", true, "start");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDeleteView2261); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeleteViewAccess().getDeleteViewKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1157:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1158:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1158:1: (lv_name_3_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1159:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteViewAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDeleteView2282);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1175:2: ( (lv_header_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1176:1: (lv_header_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1176:1: (lv_header_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1177:3: lv_header_4_0= RULE_STRING
            {
            lv_header_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDeleteView2299); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_4_0, grammarAccess.getDeleteViewAccess().getHeaderSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteViewRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDeleteView2316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDeleteViewAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1197:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1198:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1198:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1199:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDeleteViewRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeleteViewAccess().getClassClassCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDeleteView2339);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDeleteView2351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDeleteViewAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1216:1: (otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1216:3: otherlv_8= 'view-description' ( (lv_description_9_0= RULE_STRING ) )
                    {
                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleDeleteView2364); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getDeleteViewAccess().getViewDescriptionKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1220:1: ( (lv_description_9_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1221:1: (lv_description_9_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1221:1: (lv_description_9_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1222:3: lv_description_9_0= RULE_STRING
                    {
                    lv_description_9_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDeleteView2381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_description_9_0, grammarAccess.getDeleteViewAccess().getDescriptionSTRINGTerminalRuleCall_8_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDeleteViewRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"description",
                              		lv_description_9_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1238:4: ( ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=44 && LA27_0<=45)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1238:5: ( (lv_elementGroups_10_0= ruleElementGroup ) ) (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1238:5: ( (lv_elementGroups_10_0= ruleElementGroup ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1239:1: (lv_elementGroups_10_0= ruleElementGroup )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1239:1: (lv_elementGroups_10_0= ruleElementGroup )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1240:3: lv_elementGroups_10_0= ruleElementGroup
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeleteViewAccess().getElementGroupsElementGroupParserRuleCall_9_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleDeleteView2410);
                    lv_elementGroups_10_0=ruleElementGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                      	        }
                             		add(
                             			current, 
                             			"elementGroups",
                              		lv_elementGroups_10_0, 
                              		"ElementGroup");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1256:2: (otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==14) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1256:4: otherlv_11= ',' ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDeleteView2423); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getDeleteViewAccess().getCommaKeyword_9_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1260:1: ( (lv_elementGroups_12_0= ruleElementGroup ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1261:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1261:1: (lv_elementGroups_12_0= ruleElementGroup )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1262:3: lv_elementGroups_12_0= ruleElementGroup
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getDeleteViewAccess().getElementGroupsElementGroupParserRuleCall_9_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_ruleDeleteView2444);
                    	    lv_elementGroups_12_0=ruleElementGroup();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getDeleteViewRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementGroups",
                    	              		lv_elementGroups_12_0, 
                    	              		"ElementGroup");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDeleteView2460); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getDeleteViewAccess().getRightCurlyBracketKeyword_10());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeleteView"


    // $ANTLR start "entryRuleElementGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1290:1: entryRuleElementGroup returns [EObject current=null] : iv_ruleElementGroup= ruleElementGroup EOF ;
    public final EObject entryRuleElementGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementGroup = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1291:2: (iv_ruleElementGroup= ruleElementGroup EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1292:2: iv_ruleElementGroup= ruleElementGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleElementGroup_in_entryRuleElementGroup2496);
            iv_ruleElementGroup=ruleElementGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementGroup2506); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementGroup"


    // $ANTLR start "ruleElementGroup"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1299:1: ruleElementGroup returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? otherlv_7= '}' (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? ) ;
    public final EObject ruleElementGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_header_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_layout_0_0 = null;

        EObject lv_viewElements_4_0 = null;

        EObject lv_viewElements_6_0 = null;

        EObject lv_condition_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1302:28: ( ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? otherlv_7= '}' (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1303:1: ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? otherlv_7= '}' (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1303:1: ( ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? otherlv_7= '}' (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1303:2: ( (lv_layout_0_0= ruleLayout ) ) otherlv_1= 'elementgroup' ( (lv_header_2_0= RULE_STRING ) ) otherlv_3= '{' ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )? otherlv_7= '}' (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )?
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1303:2: ( (lv_layout_0_0= ruleLayout ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1304:1: (lv_layout_0_0= ruleLayout )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1304:1: (lv_layout_0_0= ruleLayout )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1305:3: lv_layout_0_0= ruleLayout
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementGroupAccess().getLayoutLayoutParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleElementGroup2552);
            lv_layout_0_0=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
              	        }
                     		set(
                     			current, 
                     			"layout",
                      		lv_layout_0_0, 
                      		"Layout");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleElementGroup2564); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getElementGroupAccess().getElementgroupKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1325:1: ( (lv_header_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1326:1: (lv_header_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1326:1: (lv_header_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1327:3: lv_header_2_0= RULE_STRING
            {
            lv_header_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleElementGroup2581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_header_2_0, grammarAccess.getElementGroupAccess().getHeaderSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getElementGroupRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"header",
                      		lv_header_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleElementGroup2598); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getElementGroupAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1347:1: ( ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=33 && LA29_0<=37)||(LA29_0>=39 && LA29_0<=40)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1347:2: ( (lv_viewElements_4_0= ruleViewElement ) ) (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1347:2: ( (lv_viewElements_4_0= ruleViewElement ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1348:1: (lv_viewElements_4_0= ruleViewElement )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1348:1: (lv_viewElements_4_0= ruleViewElement )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1349:3: lv_viewElements_4_0= ruleViewElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementGroupAccess().getViewElementsViewElementParserRuleCall_4_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleViewElement_in_ruleElementGroup2620);
                    lv_viewElements_4_0=ruleViewElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
                      	        }
                             		add(
                             			current, 
                             			"viewElements",
                              		lv_viewElements_4_0, 
                              		"ViewElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1365:2: (otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==14) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1365:4: otherlv_5= ',' ( (lv_viewElements_6_0= ruleViewElement ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleElementGroup2633); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getElementGroupAccess().getCommaKeyword_4_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1369:1: ( (lv_viewElements_6_0= ruleViewElement ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1370:1: (lv_viewElements_6_0= ruleViewElement )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1370:1: (lv_viewElements_6_0= ruleViewElement )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1371:3: lv_viewElements_6_0= ruleViewElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getElementGroupAccess().getViewElementsViewElementParserRuleCall_4_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleViewElement_in_ruleElementGroup2654);
                    	    lv_viewElements_6_0=ruleViewElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"viewElements",
                    	              		lv_viewElements_6_0, 
                    	              		"ViewElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleElementGroup2670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getElementGroupAccess().getRightCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1391:1: (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==26) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1391:3: otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleElementGroup2683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getElementGroupAccess().getWithKeyword_6_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1395:1: ( (lv_condition_9_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1396:1: (lv_condition_9_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1396:1: (lv_condition_9_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1397:3: lv_condition_9_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getElementGroupAccess().getConditionConditionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleElementGroup2704);
                    lv_condition_9_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getElementGroupRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_9_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementGroup"


    // $ANTLR start "entryRuleCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1421:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1422:2: (iv_ruleCondition= ruleCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1423:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition2742);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition2752); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1430:1: ruleCondition returns [EObject current=null] : (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonCondition_0 = null;

        EObject this_CompositeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1433:28: ( (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1434:1: (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1434:1: (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            else if ( (LA31_0==30) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1435:5: this_ComparisonCondition_0= ruleComparisonCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getComparisonConditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonCondition_in_ruleCondition2799);
                    this_ComparisonCondition_0=ruleComparisonCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComparisonCondition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1445:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_ruleCondition2826);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleVisibilityCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1461:1: entryRuleVisibilityCondition returns [EObject current=null] : iv_ruleVisibilityCondition= ruleVisibilityCondition EOF ;
    public final EObject entryRuleVisibilityCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibilityCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1462:2: (iv_ruleVisibilityCondition= ruleVisibilityCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1463:2: iv_ruleVisibilityCondition= ruleVisibilityCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVisibilityConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_entryRuleVisibilityCondition2861);
            iv_ruleVisibilityCondition=ruleVisibilityCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVisibilityCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVisibilityCondition2871); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibilityCondition"


    // $ANTLR start "ruleVisibilityCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1470:1: ruleVisibilityCondition returns [EObject current=null] : (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleVisibilityCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ComparisonCondition_0 = null;

        EObject this_CompositeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1473:28: ( (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1474:1: (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1474:1: (this_ComparisonCondition_0= ruleComparisonCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==27) ) {
                alt32=1;
            }
            else if ( (LA32_0==30) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1475:5: this_ComparisonCondition_0= ruleComparisonCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVisibilityConditionAccess().getComparisonConditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisonCondition_in_ruleVisibilityCondition2918);
                    this_ComparisonCondition_0=ruleComparisonCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ComparisonCondition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1485:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVisibilityConditionAccess().getCompositeConditionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_ruleVisibilityCondition2945);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityCondition"


    // $ANTLR start "entryRuleComparisonCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1501:1: entryRuleComparisonCondition returns [EObject current=null] : iv_ruleComparisonCondition= ruleComparisonCondition EOF ;
    public final EObject entryRuleComparisonCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1502:2: (iv_ruleComparisonCondition= ruleComparisonCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1503:2: iv_ruleComparisonCondition= ruleComparisonCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisonCondition_in_entryRuleComparisonCondition2980);
            iv_ruleComparisonCondition=ruleComparisonCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisonCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisonCondition2990); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisonCondition"


    // $ANTLR start "ruleComparisonCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1510:1: ruleComparisonCondition returns [EObject current=null] : (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) ) ;
    public final EObject ruleComparisonCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_comparisonValue_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_conditionID_1_0 = null;

        Enumerator lv_comparisonType_4_0 = null;

        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1513:28: ( (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1514:1: (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1514:1: (otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1514:3: otherlv_0= 'comparison-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ( (lv_comparisonType_4_0= ruleComparisonConditionType ) ) ( (lv_comparisonValue_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleVisibilityConditionType ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleComparisonCondition3027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getComparisonConditionAccess().getComparisonConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1518:1: ( (lv_conditionID_1_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1519:1: (lv_conditionID_1_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1519:1: (lv_conditionID_1_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1520:3: lv_conditionID_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonConditionAccess().getConditionIDQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleComparisonCondition3048);
            lv_conditionID_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonConditionRule());
              	        }
                     		set(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleComparisonCondition3060); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getComparisonConditionAccess().getColonKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1540:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1541:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1541:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1542:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getComparisonConditionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonConditionAccess().getPropertyPropertyElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleComparisonCondition3083);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1555:2: ( (lv_comparisonType_4_0= ruleComparisonConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1556:1: (lv_comparisonType_4_0= ruleComparisonConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1556:1: (lv_comparisonType_4_0= ruleComparisonConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1557:3: lv_comparisonType_4_0= ruleComparisonConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonConditionAccess().getComparisonTypeComparisonConditionTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisonConditionType_in_ruleComparisonCondition3104);
            lv_comparisonType_4_0=ruleComparisonConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonConditionRule());
              	        }
                     		set(
                     			current, 
                     			"comparisonType",
                      		lv_comparisonType_4_0, 
                      		"ComparisonConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1573:2: ( (lv_comparisonValue_5_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1574:1: (lv_comparisonValue_5_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1574:1: (lv_comparisonValue_5_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1575:3: lv_comparisonValue_5_0= RULE_STRING
            {
            lv_comparisonValue_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleComparisonCondition3121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_comparisonValue_5_0, grammarAccess.getComparisonConditionAccess().getComparisonValueSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getComparisonConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"comparisonValue",
                      		lv_comparisonValue_5_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleComparisonCondition3138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getComparisonConditionAccess().getQuestionMarkKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1595:1: ( (lv_type_7_0= ruleVisibilityConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1596:1: (lv_type_7_0= ruleVisibilityConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1596:1: (lv_type_7_0= ruleVisibilityConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1597:3: lv_type_7_0= ruleVisibilityConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getComparisonConditionAccess().getTypeVisibilityConditionTypeEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityConditionType_in_ruleComparisonCondition3159);
            lv_type_7_0=ruleVisibilityConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getComparisonConditionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_7_0, 
                      		"VisibilityConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1621:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1622:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1623:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition3195);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition3205); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1630:1: ruleCompositeCondition returns [EObject current=null] : (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleVisibilityCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleVisibilityConditionType ) ) ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_conditionID_1_0 = null;

        EObject lv_composedConditions_4_0 = null;

        Enumerator lv_compositionType_5_0 = null;

        EObject lv_composedConditions_6_0 = null;

        Enumerator lv_type_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1633:28: ( (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleVisibilityCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleVisibilityConditionType ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1634:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleVisibilityCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleVisibilityConditionType ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1634:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleVisibilityCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleVisibilityConditionType ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1634:3: otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleQualifiedName ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleVisibilityCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleVisibilityCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleVisibilityConditionType ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleCompositeCondition3242); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1638:1: ( (lv_conditionID_1_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1639:1: (lv_conditionID_1_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1639:1: (lv_conditionID_1_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1640:3: lv_conditionID_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionIDQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleCompositeCondition3263);
            lv_conditionID_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCompositeCondition3275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeConditionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCompositeCondition3287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1664:1: ( (lv_composedConditions_4_0= ruleVisibilityCondition ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1665:1: (lv_composedConditions_4_0= ruleVisibilityCondition )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1665:1: (lv_composedConditions_4_0= ruleVisibilityCondition )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1666:3: lv_composedConditions_4_0= ruleVisibilityCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsVisibilityConditionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition3308);
            lv_composedConditions_4_0=ruleVisibilityCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		add(
                     			current, 
                     			"composedConditions",
                      		lv_composedConditions_4_0, 
                      		"VisibilityCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1682:2: ( (lv_compositionType_5_0= ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1683:1: (lv_compositionType_5_0= ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1683:1: (lv_compositionType_5_0= ruleCompositeConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1684:3: lv_compositionType_5_0= ruleCompositeConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition3329);
            lv_compositionType_5_0=ruleCompositeConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"compositionType",
                      		lv_compositionType_5_0, 
                      		"CompositeConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1700:2: ( (lv_composedConditions_6_0= ruleVisibilityCondition ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1701:1: (lv_composedConditions_6_0= ruleVisibilityCondition )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1701:1: (lv_composedConditions_6_0= ruleVisibilityCondition )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1702:3: lv_composedConditions_6_0= ruleVisibilityCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsVisibilityConditionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition3350);
            lv_composedConditions_6_0=ruleVisibilityCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		add(
                     			current, 
                     			"composedConditions",
                      		lv_composedConditions_6_0, 
                      		"VisibilityCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCompositeCondition3362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleCompositeCondition3374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1726:1: ( (lv_type_9_0= ruleVisibilityConditionType ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1727:1: (lv_type_9_0= ruleVisibilityConditionType )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1727:1: (lv_type_9_0= ruleVisibilityConditionType )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1728:3: lv_type_9_0= ruleVisibilityConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getTypeVisibilityConditionTypeEnumRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleVisibilityConditionType_in_ruleCompositeCondition3395);
            lv_type_9_0=ruleVisibilityConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_9_0, 
                      		"VisibilityConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleViewElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1752:1: entryRuleViewElement returns [EObject current=null] : iv_ruleViewElement= ruleViewElement EOF ;
    public final EObject entryRuleViewElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewElement = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1753:2: (iv_ruleViewElement= ruleViewElement EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1754:2: iv_ruleViewElement= ruleViewElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getViewElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleViewElement_in_entryRuleViewElement3431);
            iv_ruleViewElement=ruleViewElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleViewElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleViewElement3441); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewElement"


    // $ANTLR start "ruleViewElement"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1761:1: ruleViewElement returns [EObject current=null] : (this_List_0= ruleList | this_Table_1= ruleTable | this_Column_2= ruleColumn | this_Text_3= ruleText | this_DateTimePicker_4= ruleDateTimePicker | this_Selection_5= ruleSelection ) ;
    public final EObject ruleViewElement() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Table_1 = null;

        EObject this_Column_2 = null;

        EObject this_Text_3 = null;

        EObject this_DateTimePicker_4 = null;

        EObject this_Selection_5 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1764:28: ( (this_List_0= ruleList | this_Table_1= ruleTable | this_Column_2= ruleColumn | this_Text_3= ruleText | this_DateTimePicker_4= ruleDateTimePicker | this_Selection_5= ruleSelection ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1765:1: (this_List_0= ruleList | this_Table_1= ruleTable | this_Column_2= ruleColumn | this_Text_3= ruleText | this_DateTimePicker_4= ruleDateTimePicker | this_Selection_5= ruleSelection )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1765:1: (this_List_0= ruleList | this_Table_1= ruleTable | this_Column_2= ruleColumn | this_Text_3= ruleText | this_DateTimePicker_4= ruleDateTimePicker | this_Selection_5= ruleSelection )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt33=1;
                }
                break;
            case 34:
                {
                alt33=2;
                }
                break;
            case 35:
                {
                alt33=3;
                }
                break;
            case 36:
            case 37:
                {
                alt33=4;
                }
                break;
            case 39:
                {
                alt33=5;
                }
                break;
            case 40:
                {
                alt33=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1766:5: this_List_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getListParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleViewElement3488);
                    this_List_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_List_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1776:5: this_Table_1= ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getTableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleViewElement3515);
                    this_Table_1=ruleTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Table_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1786:5: this_Column_2= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getColumnParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleViewElement3542);
                    this_Column_2=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Column_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1796:5: this_Text_3= ruleText
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getTextParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleText_in_ruleViewElement3569);
                    this_Text_3=ruleText();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Text_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1806:5: this_DateTimePicker_4= ruleDateTimePicker
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getDateTimePickerParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateTimePicker_in_ruleViewElement3596);
                    this_DateTimePicker_4=ruleDateTimePicker();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateTimePicker_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1816:5: this_Selection_5= ruleSelection
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getViewElementAccess().getSelectionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelection_in_ruleViewElement3623);
                    this_Selection_5=ruleSelection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Selection_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewElement"


    // $ANTLR start "entryRuleList"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1834:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1835:2: (iv_ruleList= ruleList EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1836:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList3660);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList3670); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1843:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_link_6_0 = null;

        EObject lv_link_8_0 = null;

        EObject lv_condition_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1846:28: ( (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1847:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1847:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1847:3: otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleList3707); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1851:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1852:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1852:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1853:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList3724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1869:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1870:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1870:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1871:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleList3746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleList3763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getListAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1891:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1892:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1892:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1893:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getAssociationAssociationCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleList3786);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleList3798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1910:1: ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==20) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1910:2: ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1910:2: ( (lv_link_6_0= ruleLink ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1911:1: (lv_link_6_0= ruleLink )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1911:1: (lv_link_6_0= ruleLink )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1912:3: lv_link_6_0= ruleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListAccess().getLinkLinkParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleList3820);
                    lv_link_6_0=ruleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListRule());
                      	        }
                             		add(
                             			current, 
                             			"link",
                              		lv_link_6_0, 
                              		"Link");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1928:2: (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==14) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1928:4: otherlv_7= ',' ( (lv_link_8_0= ruleLink ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleList3833); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getListAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1932:1: ( (lv_link_8_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1933:1: (lv_link_8_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1933:1: (lv_link_8_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1934:3: lv_link_8_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getListAccess().getLinkLinkParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleList3854);
                    	    lv_link_8_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getListRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_8_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleList3870); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getListAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1954:1: (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1954:3: otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) )
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleList3883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getListAccess().getWithKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1958:1: ( (lv_condition_11_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1959:1: (lv_condition_11_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1959:1: (lv_condition_11_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1960:3: lv_condition_11_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getListAccess().getConditionConditionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleList3904);
                    lv_condition_11_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getListRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_11_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleTable"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1984:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1985:2: (iv_ruleTable= ruleTable EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1986:2: iv_ruleTable= ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable3942);
            iv_ruleTable=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable3952); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1993:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? (otherlv_9= ',' )? ( ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )* )? otherlv_13= '}' (otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) ) )? ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        EObject lv_link_6_0 = null;

        EObject lv_link_8_0 = null;

        EObject lv_columns_10_0 = null;

        EObject lv_columns_12_0 = null;

        EObject lv_condition_15_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1996:28: ( (otherlv_0= 'table' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? (otherlv_9= ',' )? ( ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )* )? otherlv_13= '}' (otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1997:1: (otherlv_0= 'table' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? (otherlv_9= ',' )? ( ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )* )? otherlv_13= '}' (otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1997:1: (otherlv_0= 'table' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? (otherlv_9= ',' )? ( ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )* )? otherlv_13= '}' (otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:1997:3: otherlv_0= 'table' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )? (otherlv_9= ',' )? ( ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )* )? otherlv_13= '}' (otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTable3989); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2001:1: ( (lv_elementID_1_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2002:1: (lv_elementID_1_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2002:1: (lv_elementID_1_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2003:3: lv_elementID_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getElementIDQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable4010);
            lv_elementID_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTableRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2019:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2020:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2020:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2021:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable4027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable4044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2041:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2042:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2042:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2043:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getAssociationAssociationCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable4067);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable4079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2060:1: ( ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==20) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2060:2: ( (lv_link_6_0= ruleLink ) ) (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2060:2: ( (lv_link_6_0= ruleLink ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2061:1: (lv_link_6_0= ruleLink )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2061:1: (lv_link_6_0= ruleLink )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2062:3: lv_link_6_0= ruleLink
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTableAccess().getLinkLinkParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleTable4101);
                    lv_link_6_0=ruleLink();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTableRule());
                      	        }
                             		add(
                             			current, 
                             			"link",
                              		lv_link_6_0, 
                              		"Link");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2078:2: (otherlv_7= ',' ( (lv_link_8_0= ruleLink ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            int LA37_1 = input.LA(2);

                            if ( (LA37_1==20) ) {
                                alt37=1;
                            }


                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2078:4: otherlv_7= ',' ( (lv_link_8_0= ruleLink ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable4114); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2082:1: ( (lv_link_8_0= ruleLink ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2083:1: (lv_link_8_0= ruleLink )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2083:1: (lv_link_8_0= ruleLink )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2084:3: lv_link_8_0= ruleLink
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTableAccess().getLinkLinkParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleLink_in_ruleTable4135);
                    	    lv_link_8_0=ruleLink();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"link",
                    	              		lv_link_8_0, 
                    	              		"Link");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2100:6: (otherlv_9= ',' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2100:8: otherlv_9= ','
                    {
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable4152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getCommaKeyword_7());
                          
                    }

                    }
                    break;

            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2104:3: ( ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )* )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2104:4: ( (lv_columns_10_0= ruleColumn ) ) (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2104:4: ( (lv_columns_10_0= ruleColumn ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2105:1: (lv_columns_10_0= ruleColumn )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2105:1: (lv_columns_10_0= ruleColumn )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2106:3: lv_columns_10_0= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_8_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable4176);
                    lv_columns_10_0=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTableRule());
                      	        }
                             		add(
                             			current, 
                             			"columns",
                              		lv_columns_10_0, 
                              		"Column");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2122:2: (otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2122:4: otherlv_11= ',' ( (lv_columns_12_0= ruleColumn ) )
                    	    {
                    	    otherlv_11=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable4189); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2126:1: ( (lv_columns_12_0= ruleColumn ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2127:1: (lv_columns_12_0= ruleColumn )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2127:1: (lv_columns_12_0= ruleColumn )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2128:3: lv_columns_12_0= ruleColumn
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable4210);
                    	    lv_columns_12_0=ruleColumn();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTableRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"columns",
                    	              		lv_columns_12_0, 
                    	              		"Column");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable4226); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_9());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2148:1: (otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2148:3: otherlv_14= 'with' ( (lv_condition_15_0= ruleCondition ) )
                    {
                    otherlv_14=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable4239); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTableAccess().getWithKeyword_10_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2152:1: ( (lv_condition_15_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2153:1: (lv_condition_15_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2153:1: (lv_condition_15_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2154:3: lv_condition_15_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTableAccess().getConditionConditionParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleTable4260);
                    lv_condition_15_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTableRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_15_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2180:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2181:2: (iv_ruleColumn= ruleColumn EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2182:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn4300);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn4310); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2189:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) (otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) ) )? ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        EObject lv_condition_6_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2192:28: ( (otherlv_0= 'column' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) (otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2193:1: (otherlv_0= 'column' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) (otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2193:1: (otherlv_0= 'column' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) (otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2193:3: otherlv_0= 'column' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) (otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleColumn4347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2197:1: ( (lv_elementID_1_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2198:1: (lv_elementID_1_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2198:1: (lv_elementID_1_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2199:3: lv_elementID_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getElementIDQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleColumn4368);
            lv_elementID_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColumnRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2215:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2216:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2216:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2217:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleColumn4385); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleColumn4402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2237:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2238:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2238:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2239:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getPropertyPropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleColumn4425);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2252:2: (otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==26) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2252:4: otherlv_5= 'with' ( (lv_condition_6_0= ruleCondition ) )
                    {
                    otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleColumn4438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getWithKeyword_5_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2256:1: ( (lv_condition_6_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2257:1: (lv_condition_6_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2257:1: (lv_condition_6_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2258:3: lv_condition_6_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getColumnAccess().getConditionConditionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleColumn4459);
                    lv_condition_6_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getColumnRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_6_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleText"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2282:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2283:2: (iv_ruleText= ruleText EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2284:2: iv_ruleText= ruleText EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleText_in_entryRuleText4497);
            iv_ruleText=ruleText();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleText; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleText4507); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2291:1: ruleText returns [EObject current=null] : ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= ruleQualifiedName ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_long_0_0=null;
        Token otherlv_1=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token lv_format_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_elementID_2_0 = null;

        EObject lv_condition_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2294:28: ( ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= ruleQualifiedName ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2295:1: ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= ruleQualifiedName ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2295:1: ( ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= ruleQualifiedName ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2295:2: ( (lv_long_0_0= 'long' ) )? otherlv_1= 'text' ( (lv_elementID_2_0= ruleQualifiedName ) ) ( (lv_label_3_0= RULE_STRING ) ) (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )? otherlv_6= 'handles' ( ( ruleQualifiedName ) ) (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )?
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2295:2: ( (lv_long_0_0= 'long' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2296:1: (lv_long_0_0= 'long' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2296:1: (lv_long_0_0= 'long' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2297:3: lv_long_0_0= 'long'
                    {
                    lv_long_0_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleText4550); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_long_0_0, grammarAccess.getTextAccess().getLongLongKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(current, "long", true, "long");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleText4576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTextAccess().getTextKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2314:1: ( (lv_elementID_2_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2315:1: (lv_elementID_2_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2315:1: (lv_elementID_2_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2316:3: lv_elementID_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAccess().getElementIDQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleText4597);
            lv_elementID_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2332:2: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2333:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2333:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2334:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText4614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getTextAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2350:2: (otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==38) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2350:4: otherlv_4= 'format' ( (lv_format_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleText4632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTextAccess().getFormatKeyword_4_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2354:1: ( (lv_format_5_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2355:1: (lv_format_5_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2355:1: (lv_format_5_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2356:3: lv_format_5_0= RULE_STRING
                    {
                    lv_format_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleText4649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_format_5_0, grammarAccess.getTextAccess().getFormatSTRINGTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"format",
                              		lv_format_5_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleText4668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTextAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2376:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2377:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2377:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2378:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAccess().getPropertyPropertyCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleText4691);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2391:2: (otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==26) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2391:4: otherlv_8= 'with' ( (lv_condition_9_0= ruleCondition ) )
                    {
                    otherlv_8=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleText4704); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTextAccess().getWithKeyword_7_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2395:1: ( (lv_condition_9_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2396:1: (lv_condition_9_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2396:1: (lv_condition_9_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2397:3: lv_condition_9_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextAccess().getConditionConditionParserRuleCall_7_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleText4725);
                    lv_condition_9_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_9_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleDateTimePicker"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2421:1: entryRuleDateTimePicker returns [EObject current=null] : iv_ruleDateTimePicker= ruleDateTimePicker EOF ;
    public final EObject entryRuleDateTimePicker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateTimePicker = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2422:2: (iv_ruleDateTimePicker= ruleDateTimePicker EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2423:2: iv_ruleDateTimePicker= ruleDateTimePicker EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTimePickerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDateTimePicker_in_entryRuleDateTimePicker4763);
            iv_ruleDateTimePicker=ruleDateTimePicker();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTimePicker; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateTimePicker4773); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTimePicker"


    // $ANTLR start "ruleDateTimePicker"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2430:1: ruleDateTimePicker returns [EObject current=null] : (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
    public final EObject ruleDateTimePicker() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token lv_format_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2433:28: ( (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2434:1: (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2434:1: (otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2434:3: otherlv_0= 'date-time-picker' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDateTimePicker4810); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDateTimePickerAccess().getDateTimePickerKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2438:1: ( (lv_elementID_1_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2439:1: (lv_elementID_1_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2439:1: (lv_elementID_1_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2440:3: lv_elementID_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateTimePickerAccess().getElementIDQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDateTimePicker4831);
            lv_elementID_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateTimePickerRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2456:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2457:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2457:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2458:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDateTimePicker4848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getDateTimePickerAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimePickerRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2474:2: (otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2474:4: otherlv_3= 'format' ( (lv_format_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDateTimePicker4866); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDateTimePickerAccess().getFormatKeyword_3_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2478:1: ( (lv_format_4_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2479:1: (lv_format_4_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2479:1: (lv_format_4_0= RULE_STRING )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2480:3: lv_format_4_0= RULE_STRING
                    {
                    lv_format_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDateTimePicker4883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_format_4_0, grammarAccess.getDateTimePickerAccess().getFormatSTRINGTerminalRuleCall_3_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDateTimePickerRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"format",
                              		lv_format_4_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleDateTimePicker4902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDateTimePickerAccess().getHandlesKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2500:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2501:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2501:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2502:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDateTimePickerRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateTimePickerAccess().getPropertyPropertyCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDateTimePicker4925);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2515:2: (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==26) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2515:4: otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDateTimePicker4938); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getDateTimePickerAccess().getWithKeyword_6_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2519:1: ( (lv_condition_8_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2520:1: (lv_condition_8_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2520:1: (lv_condition_8_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2521:3: lv_condition_8_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDateTimePickerAccess().getConditionConditionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleDateTimePicker4959);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDateTimePickerRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_8_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTimePicker"


    // $ANTLR start "entryRuleSelection"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2545:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2546:2: (iv_ruleSelection= ruleSelection EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2547:2: iv_ruleSelection= ruleSelection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelection_in_entryRuleSelection4997);
            iv_ruleSelection=ruleSelection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelection; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelection5007); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2554:1: ruleSelection returns [EObject current=null] : (otherlv_0= 'selection' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_label_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        EObject lv_selectionItems_6_0 = null;

        EObject lv_selectionItems_8_0 = null;

        EObject lv_condition_11_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2557:28: ( (otherlv_0= 'selection' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2558:1: (otherlv_0= 'selection' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2558:1: (otherlv_0= 'selection' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2558:3: otherlv_0= 'selection' ( (lv_elementID_1_0= ruleQualifiedName ) ) ( (lv_label_2_0= RULE_STRING ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )? otherlv_9= '}' (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleSelection5044); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2562:1: ( (lv_elementID_1_0= ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2563:1: (lv_elementID_1_0= ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2563:1: (lv_elementID_1_0= ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2564:3: lv_elementID_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionAccess().getElementIDQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSelection5065);
            lv_elementID_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectionRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2580:2: ( (lv_label_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2581:1: (lv_label_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2581:1: (lv_label_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2582:3: lv_label_2_0= RULE_STRING
            {
            lv_label_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSelection5082); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_2_0, grammarAccess.getSelectionAccess().getLabelSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSelection5099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2602:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2603:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2603:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2604:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionAccess().getPropertyPropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSelection5122);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSelection5134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSelectionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2621:1: ( ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=41 && LA50_0<=42)) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2621:2: ( (lv_selectionItems_6_0= ruleSelectionItem ) ) (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )*
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2621:2: ( (lv_selectionItems_6_0= ruleSelectionItem ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2622:1: (lv_selectionItems_6_0= ruleSelectionItem )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2622:1: (lv_selectionItems_6_0= ruleSelectionItem )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2623:3: lv_selectionItems_6_0= ruleSelectionItem
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectionAccess().getSelectionItemsSelectionItemParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_in_ruleSelection5156);
                    lv_selectionItems_6_0=ruleSelectionItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                      	        }
                             		add(
                             			current, 
                             			"selectionItems",
                              		lv_selectionItems_6_0, 
                              		"SelectionItem");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2639:2: (otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2639:4: otherlv_7= ',' ( (lv_selectionItems_8_0= ruleSelectionItem ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSelection5169); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getSelectionAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2643:1: ( (lv_selectionItems_8_0= ruleSelectionItem ) )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2644:1: (lv_selectionItems_8_0= ruleSelectionItem )
                    	    {
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2644:1: (lv_selectionItems_8_0= ruleSelectionItem )
                    	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2645:3: lv_selectionItems_8_0= ruleSelectionItem
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSelectionAccess().getSelectionItemsSelectionItemParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_in_ruleSelection5190);
                    	    lv_selectionItems_8_0=ruleSelectionItem();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"selectionItems",
                    	              		lv_selectionItems_8_0, 
                    	              		"SelectionItem");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSelection5206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSelectionAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2665:1: (otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==26) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2665:3: otherlv_10= 'with' ( (lv_condition_11_0= ruleCondition ) )
                    {
                    otherlv_10=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleSelection5219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSelectionAccess().getWithKeyword_8_0());
                          
                    }
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2669:1: ( (lv_condition_11_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2670:1: (lv_condition_11_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2670:1: (lv_condition_11_0= ruleCondition )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2671:3: lv_condition_11_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSelectionAccess().getConditionConditionParserRuleCall_8_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleSelection5240);
                    lv_condition_11_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSelectionRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_11_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleSelectionItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2695:1: entryRuleSelectionItem returns [EObject current=null] : iv_ruleSelectionItem= ruleSelectionItem EOF ;
    public final EObject entryRuleSelectionItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionItem = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2696:2: (iv_ruleSelectionItem= ruleSelectionItem EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2697:2: iv_ruleSelectionItem= ruleSelectionItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_in_entryRuleSelectionItem5278);
            iv_ruleSelectionItem=ruleSelectionItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionItem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionItem5288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionItem"


    // $ANTLR start "ruleSelectionItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2704:1: ruleSelectionItem returns [EObject current=null] : (this_SelectionItem_Impl_0= ruleSelectionItem_Impl | this_EnumerationLiteralItem_1= ruleEnumerationLiteralItem ) ;
    public final EObject ruleSelectionItem() throws RecognitionException {
        EObject current = null;

        EObject this_SelectionItem_Impl_0 = null;

        EObject this_EnumerationLiteralItem_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2707:28: ( (this_SelectionItem_Impl_0= ruleSelectionItem_Impl | this_EnumerationLiteralItem_1= ruleEnumerationLiteralItem ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2708:1: (this_SelectionItem_Impl_0= ruleSelectionItem_Impl | this_EnumerationLiteralItem_1= ruleEnumerationLiteralItem )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2708:1: (this_SelectionItem_Impl_0= ruleSelectionItem_Impl | this_EnumerationLiteralItem_1= ruleEnumerationLiteralItem )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            else if ( (LA52_0==42) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2709:5: this_SelectionItem_Impl_0= ruleSelectionItem_Impl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionItemAccess().getSelectionItem_ImplParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_Impl_in_ruleSelectionItem5335);
                    this_SelectionItem_Impl_0=ruleSelectionItem_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelectionItem_Impl_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2719:5: this_EnumerationLiteralItem_1= ruleEnumerationLiteralItem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSelectionItemAccess().getEnumerationLiteralItemParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralItem_in_ruleSelectionItem5362);
                    this_EnumerationLiteralItem_1=ruleEnumerationLiteralItem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumerationLiteralItem_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionItem"


    // $ANTLR start "entryRuleSelectionItem_Impl"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2735:1: entryRuleSelectionItem_Impl returns [EObject current=null] : iv_ruleSelectionItem_Impl= ruleSelectionItem_Impl EOF ;
    public final EObject entryRuleSelectionItem_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionItem_Impl = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2736:2: (iv_ruleSelectionItem_Impl= ruleSelectionItem_Impl EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2737:2: iv_ruleSelectionItem_Impl= ruleSelectionItem_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionItem_ImplRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionItem_Impl_in_entryRuleSelectionItem_Impl5397);
            iv_ruleSelectionItem_Impl=ruleSelectionItem_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionItem_Impl; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionItem_Impl5407); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectionItem_Impl"


    // $ANTLR start "ruleSelectionItem_Impl"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2744:1: ruleSelectionItem_Impl returns [EObject current=null] : (otherlv_0= 'selection-item' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSelectionItem_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2747:28: ( (otherlv_0= 'selection-item' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2748:1: (otherlv_0= 'selection-item' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2748:1: (otherlv_0= 'selection-item' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2748:3: otherlv_0= 'selection-item' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleSelectionItem_Impl5444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionItem_ImplAccess().getSelectionItemKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2752:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2753:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2753:1: (lv_value_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2754:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSelectionItem_Impl5461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getSelectionItem_ImplAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionItem_ImplRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectionItem_Impl"


    // $ANTLR start "entryRuleEnumerationLiteralItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2778:1: entryRuleEnumerationLiteralItem returns [EObject current=null] : iv_ruleEnumerationLiteralItem= ruleEnumerationLiteralItem EOF ;
    public final EObject entryRuleEnumerationLiteralItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralItem = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2779:2: (iv_ruleEnumerationLiteralItem= ruleEnumerationLiteralItem EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2780:2: iv_ruleEnumerationLiteralItem= ruleEnumerationLiteralItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralItemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralItem_in_entryRuleEnumerationLiteralItem5502);
            iv_ruleEnumerationLiteralItem=ruleEnumerationLiteralItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralItem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteralItem5512); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteralItem"


    // $ANTLR start "ruleEnumerationLiteralItem"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2787:1: ruleEnumerationLiteralItem returns [EObject current=null] : (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleEnumerationLiteralItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2790:28: ( (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2791:1: (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2791:1: (otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2791:3: otherlv_0= 'enum-literal' ( (lv_value_1_0= RULE_STRING ) ) otherlv_2= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEnumerationLiteralItem5549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationLiteralItemAccess().getEnumLiteralKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2795:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2796:1: (lv_value_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2796:1: (lv_value_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2797:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEnumerationLiteralItem5566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getEnumerationLiteralItemAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralItemRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerationLiteralItem5583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationLiteralItemAccess().getHandlesKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2817:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2818:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2818:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2819:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralItemRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationLiteralItemAccess().getEnumerationLiteralEnumerationLiteralCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEnumerationLiteralItem5606);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteralItem"


    // $ANTLR start "entryRuleLayout"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2840:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2841:2: (iv_ruleLayout= ruleLayout EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2842:2: iv_ruleLayout= ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout5642);
            iv_ruleLayout=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayout; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout5652); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2849:1: ruleLayout returns [EObject current=null] : ( (lv_alignment_0_0= ruleLayoutStyle ) ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Enumerator lv_alignment_0_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2852:28: ( ( (lv_alignment_0_0= ruleLayoutStyle ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2853:1: ( (lv_alignment_0_0= ruleLayoutStyle ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2853:1: ( (lv_alignment_0_0= ruleLayoutStyle ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2854:1: (lv_alignment_0_0= ruleLayoutStyle )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2854:1: (lv_alignment_0_0= ruleLayoutStyle )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2855:3: lv_alignment_0_0= ruleLayoutStyle
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLayoutAccess().getAlignmentLayoutStyleEnumRuleCall_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLayoutStyle_in_ruleLayout5697);
            lv_alignment_0_0=ruleLayoutStyle();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLayoutRule());
              	        }
                     		set(
                     			current, 
                     			"alignment",
                      		lv_alignment_0_0, 
                      		"LayoutStyle");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2881:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2882:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2883:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5735);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName5746); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2890:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2893:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2894:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2894:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2894:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName5786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2901:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==43) && (synpred1_InternalView())) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2901:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2901:2: ( ( '.' )=>kw= '.' )
            	    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2901:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleQualifiedName5814); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName5830); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleLayoutStyle"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2924:1: ruleLayoutStyle returns [Enumerator current=null] : ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) ) ;
    public final Enumerator ruleLayoutStyle() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2926:28: ( ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2927:1: ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2927:1: ( (enumLiteral_0= 'vertical' ) | (enumLiteral_1= 'horizontal' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==44) ) {
                alt54=1;
            }
            else if ( (LA54_0==45) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2927:2: (enumLiteral_0= 'vertical' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2927:2: (enumLiteral_0= 'vertical' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2927:4: enumLiteral_0= 'vertical'
                    {
                    enumLiteral_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleLayoutStyle5891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLayoutStyleAccess().getVerticalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getLayoutStyleAccess().getVerticalEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2933:6: (enumLiteral_1= 'horizontal' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2933:6: (enumLiteral_1= 'horizontal' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2933:8: enumLiteral_1= 'horizontal'
                    {
                    enumLiteral_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLayoutStyle5908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getLayoutStyleAccess().getHorizontalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getLayoutStyleAccess().getHorizontalEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLayoutStyle"


    // $ANTLR start "ruleVisibilityConditionType"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2943:1: ruleVisibilityConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) ) ;
    public final Enumerator ruleVisibilityConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2945:28: ( ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2946:1: ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2946:1: ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) )
            int alt55=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt55=1;
                }
                break;
            case 47:
                {
                alt55=2;
                }
                break;
            case 48:
                {
                alt55=3;
                }
                break;
            case 49:
                {
                alt55=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2946:2: (enumLiteral_0= 'Hide' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2946:2: (enumLiteral_0= 'Hide' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2946:4: enumLiteral_0= 'Hide'
                    {
                    enumLiteral_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleVisibilityConditionType5953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getHideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVisibilityConditionTypeAccess().getHideEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2952:6: (enumLiteral_1= 'Show' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2952:6: (enumLiteral_1= 'Show' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2952:8: enumLiteral_1= 'Show'
                    {
                    enumLiteral_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleVisibilityConditionType5970); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getShowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVisibilityConditionTypeAccess().getShowEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2958:6: (enumLiteral_2= 'Enable' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2958:6: (enumLiteral_2= 'Enable' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2958:8: enumLiteral_2= 'Enable'
                    {
                    enumLiteral_2=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleVisibilityConditionType5987); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getEnableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVisibilityConditionTypeAccess().getEnableEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2964:6: (enumLiteral_3= 'Disable' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2964:6: (enumLiteral_3= 'Disable' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2964:8: enumLiteral_3= 'Disable'
                    {
                    enumLiteral_3=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleVisibilityConditionType6004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVisibilityConditionTypeAccess().getDisableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getVisibilityConditionTypeAccess().getDisableEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibilityConditionType"


    // $ANTLR start "ruleComparisonConditionType"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2974:1: ruleComparisonConditionType returns [Enumerator current=null] : ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) ;
    public final Enumerator ruleComparisonConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2976:28: ( ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2977:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2977:1: ( (enumLiteral_0= '==' ) | (enumLiteral_1= '<' ) | (enumLiteral_2= '>' ) )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt56=1;
                }
                break;
            case 51:
                {
                alt56=2;
                }
                break;
            case 52:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2977:2: (enumLiteral_0= '==' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2977:2: (enumLiteral_0= '==' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2977:4: enumLiteral_0= '=='
                    {
                    enumLiteral_0=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleComparisonConditionType6049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonConditionTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getComparisonConditionTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2983:6: (enumLiteral_1= '<' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2983:6: (enumLiteral_1= '<' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2983:8: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleComparisonConditionType6066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonConditionTypeAccess().getLessEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getComparisonConditionTypeAccess().getLessEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2989:6: (enumLiteral_2= '>' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2989:6: (enumLiteral_2= '>' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2989:8: enumLiteral_2= '>'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleComparisonConditionType6083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getComparisonConditionTypeAccess().getGreaterEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getComparisonConditionTypeAccess().getGreaterEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisonConditionType"


    // $ANTLR start "ruleCompositeConditionType"
    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2999:1: ruleCompositeConditionType returns [Enumerator current=null] : ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) ;
    public final Enumerator ruleCompositeConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3001:28: ( ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) ) )
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3002:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            {
            // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3002:1: ( (enumLiteral_0= '&&' ) | (enumLiteral_1= '||' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            else if ( (LA57_0==54) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3002:2: (enumLiteral_0= '&&' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3002:2: (enumLiteral_0= '&&' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3002:4: enumLiteral_0= '&&'
                    {
                    enumLiteral_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleCompositeConditionType6128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3008:6: (enumLiteral_1= '||' )
                    {
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3008:6: (enumLiteral_1= '||' )
                    // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:3008:8: enumLiteral_1= '||'
                    {
                    enumLiteral_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleCompositeConditionType6145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeConditionType"

    // $ANTLR start synpred1_InternalView
    public final void synpred1_InternalView_fragment() throws RecognitionException {   
        // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2901:3: ( '.' )
        // ../at.ac.tuwien.big.views.view/src-gen/at/ac/tuwien/big/views/view/parser/antlr/internal/InternalView.g:2902:2: '.'
        {
        match(input,43,FollowSets000.FOLLOW_43_in_synpred1_InternalView5805); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalView

    // Delegated rules

    public final boolean synpred1_InternalView() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalView_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleViewModel_in_entryRuleViewModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewGroup_in_ruleViewModel131 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleViewGroup_in_ruleViewModel152 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleViewGroup_in_entryRuleViewGroup190 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewGroup200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleViewGroup243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleViewGroup269 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleViewGroup290 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleViewGroup302 = new BitSet(new long[]{0x0000300000038000L});
        public static final BitSet FOLLOW_ruleView_in_ruleViewGroup324 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleViewGroup337 = new BitSet(new long[]{0x0000300000030000L});
        public static final BitSet FOLLOW_ruleView_in_ruleViewGroup358 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleViewGroup374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleView_in_entryRuleView410 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleView420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassIndexView_in_ruleView467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassOperationView_in_ruleView494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassIndexView_in_entryRuleClassIndexView529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassIndexView539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_ruleClassIndexView582 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleClassIndexView608 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassIndexView629 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIndexView646 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleClassIndexView663 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleClassIndexView686 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleClassIndexView698 = new BitSet(new long[]{0x0000000000188000L});
        public static final BitSet FOLLOW_19_in_ruleClassIndexView711 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleClassIndexView728 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleClassIndexView757 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleClassIndexView770 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleClassIndexView791 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleClassIndexView807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLink_in_entryRuleLink843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLink853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleLink890 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLink907 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleLink924 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassOperationView_in_entryRuleClassOperationView983 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassOperationView993 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreateView_in_ruleClassOperationView1040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadView_in_ruleClassOperationView1067 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateView_in_ruleClassOperationView1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeleteView_in_ruleClassOperationView1121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCreateView_in_entryRuleCreateView1156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCreateView1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleCreateView1212 = new BitSet(new long[]{0x0000000000210000L});
        public static final BitSet FOLLOW_16_in_ruleCreateView1230 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCreateView1256 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCreateView1277 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCreateView1294 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleCreateView1311 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCreateView1334 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleCreateView1346 = new BitSet(new long[]{0x0000300000088000L});
        public static final BitSet FOLLOW_19_in_ruleCreateView1359 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleCreateView1376 = new BitSet(new long[]{0x0000300000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleCreateView1405 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleCreateView1418 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleCreateView1439 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleCreateView1455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReadView_in_entryRuleReadView1491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReadView1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleReadView1547 = new BitSet(new long[]{0x0000000000410000L});
        public static final BitSet FOLLOW_16_in_ruleReadView1565 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleReadView1591 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReadView1612 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReadView1629 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleReadView1646 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleReadView1669 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleReadView1681 = new BitSet(new long[]{0x0000300000088000L});
        public static final BitSet FOLLOW_19_in_ruleReadView1694 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleReadView1711 = new BitSet(new long[]{0x0000300000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleReadView1740 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleReadView1753 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleReadView1774 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleReadView1790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUpdateView_in_entryRuleUpdateView1826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUpdateView1836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleUpdateView1882 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_16_in_ruleUpdateView1900 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleUpdateView1926 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateView1947 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUpdateView1964 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleUpdateView1981 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleUpdateView2004 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleUpdateView2016 = new BitSet(new long[]{0x0000300000088000L});
        public static final BitSet FOLLOW_19_in_ruleUpdateView2029 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleUpdateView2046 = new BitSet(new long[]{0x0000300000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleUpdateView2075 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleUpdateView2088 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleUpdateView2109 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleUpdateView2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeleteView_in_entryRuleDeleteView2161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeleteView2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleDeleteView2217 = new BitSet(new long[]{0x0000000001010000L});
        public static final BitSet FOLLOW_16_in_ruleDeleteView2235 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDeleteView2261 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDeleteView2282 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDeleteView2299 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDeleteView2316 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDeleteView2339 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDeleteView2351 = new BitSet(new long[]{0x0000300000088000L});
        public static final BitSet FOLLOW_19_in_ruleDeleteView2364 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDeleteView2381 = new BitSet(new long[]{0x0000300000008000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleDeleteView2410 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleDeleteView2423 = new BitSet(new long[]{0x0000300000000000L});
        public static final BitSet FOLLOW_ruleElementGroup_in_ruleDeleteView2444 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleDeleteView2460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementGroup_in_entryRuleElementGroup2496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementGroup2506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleElementGroup2552 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleElementGroup2564 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleElementGroup2581 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleElementGroup2598 = new BitSet(new long[]{0x000001BE00008000L});
        public static final BitSet FOLLOW_ruleViewElement_in_ruleElementGroup2620 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleElementGroup2633 = new BitSet(new long[]{0x000001BE00000000L});
        public static final BitSet FOLLOW_ruleViewElement_in_ruleElementGroup2654 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleElementGroup2670 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleElementGroup2683 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleElementGroup2704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition2742 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition2752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonCondition_in_ruleCondition2799 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleCondition2826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_entryRuleVisibilityCondition2861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVisibilityCondition2871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonCondition_in_ruleVisibilityCondition2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleVisibilityCondition2945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisonCondition_in_entryRuleComparisonCondition2980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisonCondition2990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleComparisonCondition3027 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComparisonCondition3048 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleComparisonCondition3060 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleComparisonCondition3083 = new BitSet(new long[]{0x001C000000000000L});
        public static final BitSet FOLLOW_ruleComparisonConditionType_in_ruleComparisonCondition3104 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleComparisonCondition3121 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleComparisonCondition3138 = new BitSet(new long[]{0x0003C00000000000L});
        public static final BitSet FOLLOW_ruleVisibilityConditionType_in_ruleComparisonCondition3159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition3195 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition3205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleCompositeCondition3242 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeCondition3263 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleCompositeCondition3275 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleCompositeCondition3287 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition3308 = new BitSet(new long[]{0x0060000000000000L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition3329 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleVisibilityCondition_in_ruleCompositeCondition3350 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCompositeCondition3362 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleCompositeCondition3374 = new BitSet(new long[]{0x0003C00000000000L});
        public static final BitSet FOLLOW_ruleVisibilityConditionType_in_ruleCompositeCondition3395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleViewElement_in_entryRuleViewElement3431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleViewElement3441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_ruleViewElement3488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleViewElement3515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleViewElement3542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_ruleViewElement3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTimePicker_in_ruleViewElement3596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_ruleViewElement3623 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList3660 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList3670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleList3707 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList3724 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleList3746 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleList3763 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleList3786 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleList3798 = new BitSet(new long[]{0x0000000000108000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleList3820 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleList3833 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleList3854 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleList3870 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleList3883 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleList3904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable3942 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable3952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleTable3989 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable4010 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable4027 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTable4044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable4067 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable4079 = new BitSet(new long[]{0x000000080010C000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleTable4101 = new BitSet(new long[]{0x000000080000C000L});
        public static final BitSet FOLLOW_14_in_ruleTable4114 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleLink_in_ruleTable4135 = new BitSet(new long[]{0x000000080000C000L});
        public static final BitSet FOLLOW_14_in_ruleTable4152 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable4176 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleTable4189 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable4210 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleTable4226 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleTable4239 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleTable4260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn4300 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn4310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleColumn4347 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleColumn4368 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleColumn4385 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleColumn4402 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleColumn4425 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleColumn4438 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleColumn4459 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleText_in_entryRuleText4497 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleText4507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleText4550 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleText4576 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleText4597 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText4614 = new BitSet(new long[]{0x0000004000040000L});
        public static final BitSet FOLLOW_38_in_ruleText4632 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleText4649 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleText4668 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleText4691 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleText4704 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleText4725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateTimePicker_in_entryRuleDateTimePicker4763 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateTimePicker4773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDateTimePicker4810 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDateTimePicker4831 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimePicker4848 = new BitSet(new long[]{0x0000004000040000L});
        public static final BitSet FOLLOW_38_in_ruleDateTimePicker4866 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDateTimePicker4883 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleDateTimePicker4902 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDateTimePicker4925 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleDateTimePicker4938 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleDateTimePicker4959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelection_in_entryRuleSelection4997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelection5007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleSelection5044 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelection5065 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSelection5082 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSelection5099 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelection5122 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSelection5134 = new BitSet(new long[]{0x0000060000008000L});
        public static final BitSet FOLLOW_ruleSelectionItem_in_ruleSelection5156 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_14_in_ruleSelection5169 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_ruleSelectionItem_in_ruleSelection5190 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_15_in_ruleSelection5206 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleSelection5219 = new BitSet(new long[]{0x0000000048000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleSelection5240 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionItem_in_entryRuleSelectionItem5278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionItem5288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionItem_Impl_in_ruleSelectionItem5335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralItem_in_ruleSelectionItem5362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionItem_Impl_in_entryRuleSelectionItem_Impl5397 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionItem_Impl5407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleSelectionItem_Impl5444 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSelectionItem_Impl5461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralItem_in_entryRuleEnumerationLiteralItem5502 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralItem5512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleEnumerationLiteralItem5549 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEnumerationLiteralItem5566 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerationLiteralItem5583 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEnumerationLiteralItem5606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout5642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout5652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutStyle_in_ruleLayout5697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5735 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5786 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleQualifiedName5814 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5830 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_44_in_ruleLayoutStyle5891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleLayoutStyle5908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleVisibilityConditionType5953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleVisibilityConditionType5970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleVisibilityConditionType5987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleVisibilityConditionType6004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleComparisonConditionType6049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleComparisonConditionType6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleComparisonConditionType6083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleCompositeConditionType6128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleCompositeConditionType6145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_synpred1_InternalView5805 = new BitSet(new long[]{0x0000000000000002L});
    }


}