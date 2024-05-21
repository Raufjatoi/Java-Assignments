import streamlit as st
import random

st.title("Number Guessing Game")
st.write("Welcome to the Number Guessing Game! Try to guess the randomly generated number.")

# Define the range for the random number
min_value = 1
max_value = 100

# Initialize session state for the random number, user guess, and feedback
if 'random_number' not in st.session_state:
    st.session_state.random_number = random.randint(min_value, max_value)
if 'guess' not in st.session_state:
    st.session_state.guess = None
if 'feedback' not in st.session_state:
    st.session_state.feedback = ""

# Display the range
st.write(f"Guess a number between {min_value} and {max_value}.")

# Input for the user's guess
st.session_state.guess = st.number_input("Enter your guess:", min_value, max_value, key='guess_input')

# Button to submit the guess
if st.button("Submit Guess"):
    if st.session_state.guess == st.session_state.random_number:
        st.session_state.feedback = "Congratulations! You guessed the correct number!"
        # Reset the game
        st.session_state.random_number = random.randint(min_value, max_value)
    elif st.session_state.guess < st.session_state.random_number:
        st.session_state.feedback = "Too low! Try again."
    else:
        st.session_state.feedback = "Too high! Try again."
    st.experimental_rerun()

# Display feedback
st.write(st.session_state.feedback)

# Button to reset the game
if st.button("Reset Game"):
    st.session_state.random_number = random.randint(min_value, max_value)
    st.session_state.feedback = ""
    st.session_state.guess = None
    st.experimental_rerun()
